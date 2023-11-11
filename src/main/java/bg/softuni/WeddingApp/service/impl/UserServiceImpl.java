package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.UserLoginDTO;
import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.service.UserService;
import bg.softuni.WeddingApp.session.LoggedUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final LoggedUser loggedUser;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           LoggedUser loggedUser,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.loggedUser = loggedUser;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean register(UserRegistrationDTO userRegistrationDTO) {
        // password == confirmPassword
        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword())){
            return false;
        }

        //duplicate email
        Optional<User> userByEmail = userRepository.findUserByEmail(userRegistrationDTO.getEmail());
        if (userByEmail.isPresent()){
            return false;
        }

        //duplicate user
        Optional<User> userByUsername = userRepository.findUserByUsername(userRegistrationDTO.getUsername());
        if (userByUsername.isPresent()){
            return false;
        }
        //TODO: use model mapper and activation link
        User user = new User();
        user.setUsername(userRegistrationDTO.getUsername());
        user.setEmail(userRegistrationDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        this.userRepository.save(user);

        return true;
    }

    @Override
    public void logOutUser() {
        loggedUser.logout();
    }

    public boolean login(UserLoginDTO userLoginDTO) {
        var  userEntity = userRepository.
                findUserByUsername(userLoginDTO.getUsername())
                .orElse(null);

        boolean loginSuccess = false;

        if (userEntity != null){
            String rawPassword = userLoginDTO.getPassword();
            String encodedPassword = userEntity.getPassword();
            loginSuccess = encodedPassword != null
                    && passwordEncoder.matches(rawPassword, encodedPassword);

            if(loginSuccess){
                loggedUser
                        .setId(userEntity.getId())
                        .setUsername(userLoginDTO.getUsername());
            }else {
                loggedUser.logout();
            }
        }

        return loginSuccess;

    }
}
