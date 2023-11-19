package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.entity.WeddingStory;
import bg.softuni.WeddingApp.service.impl.WeddingStoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final WeddingStoryServiceImpl weddingStoryService;

    public HomeController(WeddingStoryServiceImpl weddingStoryService) {
        this.weddingStoryService = weddingStoryService;
    }

    @GetMapping ("/")
    public String loggedOutIndex(Model model) {

        WeddingStory mostCommentedStory = weddingStoryService.getMostCommentedStory();

        model.addAttribute("mostCommented", mostCommentedStory);
        return "index";
    }

    @GetMapping("/home")
    public String loggedHome (){
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
