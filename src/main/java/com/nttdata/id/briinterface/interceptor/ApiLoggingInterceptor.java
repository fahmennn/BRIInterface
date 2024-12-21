package com.nttdata.id.briinterface.interceptor;

import com.nttdata.id.briinterface.config.LoggingConfig;
import com.nttdata.id.briinterface.model.mysql.ApiLog;
import com.nttdata.id.briinterface.repository.mysql.ApiLogRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Interceptor for logging API requests and responses.
 */
@Component
public class ApiLoggingInterceptor implements HandlerInterceptor {

    @Autowired
    private ApiLogRepository apiLogRepository;

    @Autowired
    private LoggingConfig loggingConfig;

    
    @Value("${jwt.secret}")
    private String secret;// Replace with your actual secret key

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (loggingConfig.isLogRequest()) {
            String payload = "";
            String correlationId = "";
            if (response.getHeader("Correlation-Id") != null ){
                correlationId = response.getHeader("Correlation-Id");
            } else {
                correlationId = generateCorrelationId();
            }
            String clientIpAddress = request.getRemoteAddr();
            String userInformation = getUserInformationFromJwt(request);

            ApiLog logEntry = new ApiLog();
            logEntry.setLogType("REQUEST");
            logEntry.setEndpointPath(request.getRequestURI());
            logEntry.setPayloadContent(payload);
            logEntry.setLogTimestamp(LocalDateTime.now());
            logEntry.setCorrelationId(correlationId);
            logEntry.setClientIpAddress(clientIpAddress);
            logEntry.setUserInformation(userInformation);

            apiLogRepository.save(logEntry);

            response.setHeader("Correlation-Id", correlationId);
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (loggingConfig.isLogResponse()) {
            // Implement logic to capture response payload
            String payload = ""; // Placeholder for actual response payload
            String correlationId = response.getHeader("Correlation-Id");
            String clientIpAddress = request.getRemoteAddr();
            String userInformation = getUserInformationFromJwt(request);

            ApiLog logEntry = new ApiLog();
            logEntry.setLogType("RESPONSE");
            logEntry.setEndpointPath(request.getRequestURI());
            logEntry.setPayloadContent(payload);
            logEntry.setLogTimestamp(LocalDateTime.now());
            logEntry.setCorrelationId(correlationId);
            logEntry.setClientIpAddress(clientIpAddress);
            logEntry.setUserInformation(userInformation);

            apiLogRepository.save(logEntry);
        }
    }

    private String generateCorrelationId() {
        return UUID.randomUUID().toString();
    }

    private String getUserInformationFromJwt(HttpServletRequest request) {
        String authorizationHeader = request.getHeader("Authorization");
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring(7); // Remove "Bearer " prefix
            try {
                Claims claims = Jwts.parser()
                        .setSigningKey(secret) // Ensure this is the correct secret
                        .parseClaimsJws(token)
                        .getBody();
                
                return claims.getSubject(); // This should return "admin"
            } catch (JwtException e) {
            	e.printStackTrace();
                // Handle token parsing exceptions
                return "Invalid Token";
            }
        }
        return "No JWT Provided";
    }
}