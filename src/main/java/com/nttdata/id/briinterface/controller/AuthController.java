package com.nttdata.id.briinterface.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.nttdata.id.briinterface.model.mysql.User;
import com.nttdata.id.briinterface.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expirationTime;


    @PostMapping("/login")
    public String login(@RequestBody User loginRequest) {
        User user = userService.findByUsername(loginRequest.getUsername());
        if (user == null || !user.isAccountEnabled()) {
            return "Account is locked or does not exist";
        }

        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

            if (authentication.isAuthenticated()) {
                user.setFailedLoginAttempts(0);
                user.setLastSuccessfulLogin(new Date());
                userService.save(user);

                UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
                String token = Jwts.builder()
                        .setSubject(userDetails.getUsername())
                        .claim("roles", userDetails.getAuthorities().stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                        .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                        .signWith(SignatureAlgorithm.HS512, secret)
                        .compact();

                return token;
            }
        } catch (AuthenticationException e) {
            if (user != null) {
                user.setFailedLoginAttempts(user.getFailedLoginAttempts() + 1);
                user.setLastFailedLogin(new Date());
                if (user.getFailedLoginAttempts() >= 3) {
                    user.setAccountEnabled(false);
                }
                userService.save(user);
            }
            return "Invalid credentials";
        }
        return "Invalid credentials";
    }

    @PostMapping("/logout")
    public String logout(@RequestHeader("Authorization") String token) {
        // Implement any additional logout logic if necessary
        return "Logged out successfully";	
    }

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()) != null) {
            return "Username already exists";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(user.getRole()); // Default role
        userService.save(user);
        return "User  registered successfully";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/users")
    public List<User> listUsers() {
        return userService.findAll();
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/users/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/users/{username}")
    public String updateUserByUsername(@PathVariable String username, @RequestBody User user) {
        User existingUser  = userService.findByUsername(username);
        if (existingUser  == null) {
            return "User  not found";
        }
        existingUser .setUsername(user.getUsername());
        existingUser .setPassword(passwordEncoder.encode(user.getPassword()));
        existingUser .setRole(user.getRole());
        userService.save(existingUser );
        return "User  updated successfully";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/users/{username}")
    public String deleteUserByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);
        if (user == null) {
            return "User  not found";
        }
        userService.deleteByUsername(username);
        return "User  deleted successfully";
    }
}