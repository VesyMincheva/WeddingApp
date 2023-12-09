package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.UserProfileDTO;
import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.model.entity.User;

import java.util.List;

public interface UserService {
    boolean register(UserRegistrationDTO userRegistrationDTO);

    User getUserByUserName(String username);

    List<UserProfileDTO> getAll();

}
