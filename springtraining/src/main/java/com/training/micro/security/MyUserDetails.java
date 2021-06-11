package com.training.micro.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder br;

    @Autowired
    private IUserDAO              userDao;

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        Optional<User> findByIdLoc = this.userDao.findById(usernameParam);
        User myUserLoc = findByIdLoc.orElseThrow(() -> new UsernameNotFoundException("User yok " + usernameParam));
        return org.springframework.security.core.userdetails.User.builder()
                                                                 .password(this.br.encode(myUserLoc.getPassword()))
                                                                 .username(usernameParam)
                                                                 .roles(myUserLoc.getRole())
                                                                 .build();
    }


}
