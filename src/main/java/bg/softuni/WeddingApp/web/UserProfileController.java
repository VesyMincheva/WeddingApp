package bg.softuni.WeddingApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {

    @GetMapping("/user/profile")
    public String userProfile(){
        return "profile";
    }

    @GetMapping("/bicycle")
    public String userBicycle(){
        return "bicycle";
    }
}
