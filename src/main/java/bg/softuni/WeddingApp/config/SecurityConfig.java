package bg.softuni.WeddingApp.config;

import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.service.impl.WeddingAppUserDetailsService;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(
                        requests -> requests
                                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                                .requestMatchers("/", "/login", "/register", "/about").permitAll()
                                .requestMatchers("/login-error").permitAll()
                                .requestMatchers("/stories/all").permitAll()
                                .requestMatchers("/stories/traditional").permitAll()
                                .requestMatchers("/stories/modern").permitAll()
                                .requestMatchers("/stories/rustic").permitAll()
                                .requestMatchers("/stories/vintage").permitAll()
                                .requestMatchers("/stories/beach").permitAll()
                                .requestMatchers("/stories/indoor").permitAll()
                                .requestMatchers("/stories/garden").permitAll()
                                .anyRequest().authenticated()
                ).formLogin(
                  form -> {
                      form.loginPage("/login")
                              .usernameParameter("username")
                              .passwordParameter("password")
                              .defaultSuccessUrl("/")
                              .failureForwardUrl("/login-error");
                  }
                ).logout(
                        logout -> {
                            logout.logoutUrl("/logout")
                                    .logoutSuccessUrl("/")
                                    .invalidateHttpSession(true);
                        }

                );
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository){
        return new WeddingAppUserDetailsService(userRepository);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return Pbkdf2PasswordEncoder.defaultsForSpringSecurity_v5_8();
    }
}
