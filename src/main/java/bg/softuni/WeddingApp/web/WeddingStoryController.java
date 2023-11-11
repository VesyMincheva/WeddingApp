package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.service.impl.WeddingStoryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeddingStoryController {

    private final WeddingStoryServiceImpl weddingStoryService;

    public WeddingStoryController(WeddingStoryServiceImpl weddingStoryService) {
        this.weddingStoryService = weddingStoryService;
    }


    @GetMapping("/add")
    public String add(){
        return "add-story";
    }

    @GetMapping("/add")
    public String add(AddWeddingStoryDTO addWeddingStoryDTO){
        return "/home";
    }
}
