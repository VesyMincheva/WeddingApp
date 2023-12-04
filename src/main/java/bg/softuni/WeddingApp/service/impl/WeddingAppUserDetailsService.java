package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class WeddingAppUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public WeddingAppUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username)
                .map(this::mapUserToUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found!"));

    }

    private UserDetails mapUserToUserDetails(User user){
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(List.of()) //TODO: add roles
                .build();
    }
}
