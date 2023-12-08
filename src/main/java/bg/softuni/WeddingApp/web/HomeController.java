package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.entity.WeddingStory;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private final WeddingStoryService weddingStoryService;

    public HomeController(WeddingStoryService weddingStoryService) {
        this.weddingStoryService = weddingStoryService;
    }

    @GetMapping ("/")
    public String loggedOutIndex(Model model) {

        WeddingStory mostCommentedStory = weddingStoryService.getMostCommentedStory();

        model.addAttribute("mostCommented", mostCommentedStory);
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
