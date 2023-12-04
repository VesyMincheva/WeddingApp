package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.UserRegistrationDTO;
import bg.softuni.WeddingApp.service.UserService;
import bg.softuni.WeddingApp.service.impl.WeddingStoryServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    private final UserService userService;
    private final WeddingStoryServiceImpl weddingStoryService;

    public UserController(UserService userService, WeddingStoryServiceImpl weddingStoryService) {
        this.userService = userService;
        this.weddingStoryService = weddingStoryService;
    }

    @ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO initRegistrationDto (Model model){
        return new UserRegistrationDTO();
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid UserRegistrationDTO userRegistrationDTO,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors() || !this.userService.register(userRegistrationDTO)){
            redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
            redirectAttributes.addFlashAttribute(
                    "org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);

            return "redirect:/register";
        }

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


}
