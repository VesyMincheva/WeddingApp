package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.model.entity.Role;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.model.enums.UserRoles;
import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
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
        //TODO:activation link
        User user = modelMapper.map(userRegistrationDTO, User.class);
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
//        Role role = new Role();
//        role.setName(UserRoles.USER);
//        user.getRoles().add(role);
        this.userRepository.save(user);

        return true;
    }

}
