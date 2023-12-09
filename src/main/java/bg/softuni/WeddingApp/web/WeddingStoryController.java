package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.dto.StoryDetailsDto;
import bg.softuni.WeddingApp.model.dto.StoryGetAllDto;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
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

    @GetMapping("/story/add")
    public String add(){
        return "add-story";
    }

    @PostMapping("/story/add")
    public String add(@Valid AddWeddingStoryDTO addWeddingStoryDTO,
                      BindingResult bindingResult,
                      RedirectAttributes redirectAttributes,
                      @AuthenticationPrincipal UserDetails author){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("addWeddingStoryDTO", addWeddingStoryDTO);
            redirectAttributes.addFlashAttribute(
                    "org.springframework.validation.BindingResult.addWeddingStoryDTO",bindingResult);
            return "redirect:/story/add";
        }
        weddingStoryService.addStory(addWeddingStoryDTO, author.getUsername());
        return "redirect:/";
    }

    @GetMapping("/stories/all")
    public ModelAndView getAllStories(){
        List<StoryGetAllDto> stories = weddingStoryService.getAll();
        ModelAndView modelAndView = new ModelAndView("stories");
        modelAndView.addObject("stories", stories);
        return modelAndView;
    }

    @GetMapping("/stories/traditional")
    public ModelAndView getAllTraditionalWeddings(){
        List<StoryGetAllDto> traditionalWeddings = weddingStoryService.getAllTraditionalWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-traditional");
        modelAndView.addObject("traditionalWeddings", traditionalWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/modern")
    public ModelAndView getAllModernWeddings(){
        List<StoryGetAllDto> modernWeddings = weddingStoryService.getAllModernWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-modern");
        modelAndView.addObject("modernWeddings", modernWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/vintage")
    public ModelAndView getAllVintageWeddings(){
        List<StoryGetAllDto> vintageWeddings = weddingStoryService.getAllVintageWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-vintage");
        modelAndView.addObject("vintageWeddings", vintageWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/rustic")
    public ModelAndView getAllRusticWeddings(){
        List<StoryGetAllDto> rusticWeddings = weddingStoryService.getAllRusticWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-rustic");
        modelAndView.addObject("rusticWeddings", rusticWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/beach")
    public ModelAndView getAllBeachWeddings(){
        List<StoryGetAllDto> beachWeddings = weddingStoryService.getAllBeachWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-beach");
        modelAndView.addObject("beachWeddings", beachWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/indoor")
    public ModelAndView getAllIndoorWeddings(){
        List<StoryGetAllDto> indoorWeddings = weddingStoryService.getAllIndoorWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-indoor");
        modelAndView.addObject("indoorWeddings", indoorWeddings);
        return modelAndView;
    }

    @GetMapping("/stories/garden")
    public ModelAndView getAllGardenWeddings(){
        List<StoryGetAllDto> gardenWeddings = weddingStoryService.getAllGardenWeddings();
        ModelAndView modelAndView = new ModelAndView("wedding-garden");
        modelAndView.addObject("gardenWeddings", gardenWeddings);
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
