package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.service.impl.WeddingStoryServiceImpl;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WeddingStoryController {

    private final WeddingStoryServiceImpl weddingStoryService;

    public WeddingStoryController(WeddingStoryServiceImpl weddingStoryService) {
        this.weddingStoryService = weddingStoryService;
    }

    @ModelAttribute("locations")
    public LocationEnum[] locations(){
        return LocationEnum.values();
    }

    @ModelAttribute("styles")
    public WeddingStyleEnum[] styles(){
        return WeddingStyleEnum.values();
    }

    @ModelAttribute
    public AddWeddingStoryDTO initAddStoryDTO(){
        return new AddWeddingStoryDTO();
    }


    @GetMapping("/add")
    public String add(){
        return "add-story";
    }

    @PostMapping("/add")
    public String add(@Valid AddWeddingStoryDTO addWeddingStoryDTO,
                      BindingResult bindingResult,
                      RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("addWeddingStoryDTO", addWeddingStoryDTO);
            redirectAttributes.addFlashAttribute(
                    "org.springframework.validation.BindingResult.addWeddingStoryDTO",bindingResult);
            return "redirect:/add";
        }
        weddingStoryService.addStory(addWeddingStoryDTO);
        return "redirect:/home";
    }

    @GetMapping("/stories/all")
    public String getAllStories(){
        return "story";
    }

    @GetMapping("/stories/details/{id}")
    public String storyDetail(){
        return "story-details";
    }
}
