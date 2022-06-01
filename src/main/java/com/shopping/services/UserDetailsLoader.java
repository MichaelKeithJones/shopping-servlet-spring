package com.shopping.services;

import com.shopping.models.User;
import com.shopping.models.UserWithRoles;
import com.shopping.repositories.UserRepository;
import org.springframework.stereotype.*;
import org.springframework.security.core.userdetails.*;

@Service
public class UserDetailsLoader implements UserDetailsService {
    private final UserRepository users;

    public UserDetailsLoader(UserRepository users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        return new UserWithRoles(user);
    }
}
