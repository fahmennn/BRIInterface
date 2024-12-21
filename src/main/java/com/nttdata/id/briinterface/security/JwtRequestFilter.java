package com.nttdata.id.briinterface.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Value("${jwt.secret}")
    private String secret;

    @Autowired
    private UserDetailsService userDetailsService;

    @SuppressWarnings("unchecked")
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        
        final String requestTokenHeader = request.getHeader("Authorization");

        String username = null;
        String jwtToken = null;

        if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
            jwtToken = requestTokenHeader.substring(7);
            try {
            	// Dalam JwtRequestFilter, pastikan Anda mengekstrak peran dan mengaturnya dalam otentikasi
            	Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(jwtToken).getBody();
            	username = claims.getSubject();
                List<String> roles = claims.get("roles", List.class);
            	List<GrantedAuthority> authorities = roles.stream()
            	        .map(SimpleGrantedAuthority::new)
            	        .collect(Collectors.toList());

            	if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            	    UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

            	    if (validateToken(jwtToken, userDetails)) {
            	        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
            	                userDetails, null, authorities);
            	        usernamePasswordAuthenticationToken
            	                .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            	        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            	    }
            	}
            } catch (IllegalArgumentException e) {
                logger.error("Unable to get JWT Token", e);
            } catch (ExpiredJwtException e) {
                logger.warn("JWT Token has expired", e);
            } catch (SignatureException e) {
                logger.error("JWT signature does not match locally computed signature", e);
            } catch (DataAccessResourceFailureException e) {
                response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE); // HTTP 503
                sendErrorResponse(response, "Database Connection Timeout ", HttpServletResponse.SC_SERVICE_UNAVAILABLE, e.getMessage(), null);
                return;
            } catch (JDBCConnectionException e) {
                response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE); // HTTP 503
                response.getWriter().write("Unable to connect to the database. Please try again later.");
                return;
            } catch (Exception e) {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); // HTTP 500
                response.getWriter().write("message : " + e);
                return; // Hentikan eksekusi lebih lanjut
            }
        } else {
            logger.warn("JWT Token does not begin with Bearer String");
        }

        chain.doFilter(request, response);
    }

    private boolean validateToken(String token, UserDetails userDetails) {
        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            String username = claims.getSubject();
            return (username.equals(userDetails.getUsername()) && !claims.getExpiration().before(new Date()));
        } catch (Exception e) {
            logger.error("Token validation error", e);
            return false;
        }
    }

    // Helper method to send error response as JSON
    private void sendErrorResponse(HttpServletResponse response, String statusDesc, int statusCode, String message, String data) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String jsonResponse = String.format("{\"status\": %d, \"statusDesc\": \"%s\", \"message\": \"%s\", \"data\": \"%s\"}", statusCode, statusDesc, message, data);
        response.getWriter().write(jsonResponse);
    }
}