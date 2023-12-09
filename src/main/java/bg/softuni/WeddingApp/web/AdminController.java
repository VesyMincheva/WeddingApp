package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.UserProfileDTO;
import bg.softuni.WeddingApp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("userProfileDTO")
    public UserProfileDTO getUserProfileDTO (){
        return new UserProfileDTO();
    }

    @GetMapping("/admin")
    public ModelAndView adminPanel(){
        List<UserProfileDTO> users = userService.getAll();
        ModelAndView modelAndView = new ModelAndView("/admin-panel");
        modelAndView.addObject("users", users);
        return modelAndView;
    }
}
