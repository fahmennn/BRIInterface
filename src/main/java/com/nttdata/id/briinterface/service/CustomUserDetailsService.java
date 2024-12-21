package com.nttdata.id.briinterface.service;

import com.nttdata.id.briinterface.model.mysql.User;
import com.nttdata.id.briinterface.repository.mysql.UserRepository;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = userRepository.findByUsername(username);
            if (user == null) {
                throw new UsernameNotFoundException("User not found");
            }
            // Mengonversi peran pengguna menjadi GrantedAuthority
            GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
    
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    List.of(authority) // Menggunakan List.of() untuk membuat daftar tunggal
            
            );
        } catch (JDBCConnectionException e) {
            throw e;
        } catch (DataAccessResourceFailureException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
}