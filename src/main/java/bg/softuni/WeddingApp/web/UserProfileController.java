package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.UserProfileDTO;
import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

@Controller
public class UserProfileController {

    private final UserService userService;

    public UserProfileController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userProfileDTO")
    public UserProfileDTO getUserProfileDTO (){
        return new UserProfileDTO();
    }

    @GetMapping("/user/profile")
    public String userProfile(Principal principal,
                              Model model,
                              UserProfileDTO userProfileDTO){
        User user = userService.getUserByUserName(principal.getName());
        userProfileDTO.setUsername(user.getUsername());
        userProfileDTO.setEmail(user.getEmail());
        userProfileDTO.setFirstName(user.getFirstName());
        userProfileDTO.setLastName(user.getLastName());
        model.addAttribute("user", userProfileDTO);

        return "profile";
    }

}
