package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.entity.Role;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class WeddingAppUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public WeddingAppUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username)
                .map(WeddingAppUserDetailsService::mapUserToUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("User " + username + " not found!"));

    }
    private static UserDetails mapUserToUserDetails(User user){
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities(user.getRoles()
                        .stream()
                        .map(WeddingAppUserDetailsService::mapRoles)
                        .toList())
                .build();
    }

    private static GrantedAuthority mapRoles (Role role){
        return new SimpleGrantedAuthority("ROLE_" + role.getRole().name());
    }
}
