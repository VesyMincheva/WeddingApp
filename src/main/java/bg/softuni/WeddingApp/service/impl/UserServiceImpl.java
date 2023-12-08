package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.model.entity.Role;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.model.enums.UserRolesEnum;
import bg.softuni.WeddingApp.repository.RoleRepository;
import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }
    @Override
    public boolean register(UserRegistrationDTO userRegistrationDTO) {
        // password == confirmPassword
        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword())){
            throw new RuntimeException("Passwords do not match!");
        }
        //duplicate email
        Optional<User> userByEmail = userRepository.findUserByEmail(userRegistrationDTO.getEmail());
        if (userByEmail.isPresent()){
            throw new RuntimeException("Email already used!");
        }
        //duplicate user
        Optional<User> userByUsername = userRepository.findUserByUsername(userRegistrationDTO.getUsername());
        if (userByUsername.isPresent()){
            throw new RuntimeException("Username already used!");
        }

        User user = modelMapper.map(userRegistrationDTO, User.class);
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        user.setRoles(List.of(roleRepository.findByRole(UserRolesEnum.USER)));
        this.userRepository.save(user);

        return true;
    }
}
