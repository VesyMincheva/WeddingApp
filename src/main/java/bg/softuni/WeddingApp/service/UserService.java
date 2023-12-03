package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.UserLoginDTO;
import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;

public interface UserService {
    boolean register(UserRegistrationDTO userRegistrationDTO);

    void logOutUser();

    boolean login(UserLoginDTO userLoginDTO);
}
