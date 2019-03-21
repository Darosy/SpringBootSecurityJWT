package com.derosy.jwtauth.JwtSpringBootAuth.services;

import com.derosy.jwtauth.JwtSpringBootAuth.model.User;
import com.derosy.jwtauth.JwtSpringBootAuth.model.UserPrinciple;
import com.derosy.jwtauth.JwtSpringBootAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(userName).orElseThrow(
                () -> new UsernameNotFoundException("User Not Found with -> username or email :"+userName)
        );
        return UserPrinciple.build(user);
    }
}
