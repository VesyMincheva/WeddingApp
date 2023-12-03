package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.dto.StoryDetailsDto;
import bg.softuni.WeddingApp.model.dto.StoryGetAllDto;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class WeddingStoryController {

    private final WeddingStoryService weddingStoryService;

    public WeddingStoryController(WeddingStoryService weddingStoryService) {
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
    public ModelAndView getAllStories(){
        List<StoryGetAllDto> stories = weddingStoryService.getAll();
        ModelAndView modelAndView = new ModelAndView("stories");
        modelAndView.addObject("stories", stories);
        return modelAndView;
    }

    @GetMapping("/stories/details/{id}")
    public ModelAndView storyDetail(@PathVariable("id") Long id){
        StoryDetailsDto story = weddingStoryService.getDetails(id);

        ModelAndView modelAndView = new ModelAndView("story-details");
        modelAndView.addObject("story",story);

        return modelAndView;
    }
}
