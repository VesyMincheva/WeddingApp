package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;

public interface UserService {
    public boolean register(UserRegistrationDTO userRegistrationDTO);

    void logOutUser();
}
