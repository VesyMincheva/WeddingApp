package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.dto.StoryDetailsDto;
import bg.softuni.WeddingApp.model.dto.StoryGetAllDto;
import bg.softuni.WeddingApp.model.entity.WeddingStory;

import java.util.List;

public interface WeddingStoryService {

    void addStory(AddWeddingStoryDTO addWeddingStoryDTO);

    WeddingStory getMostCommentedStory();
    StoryDetailsDto getDetails(Long id);
    List<StoryGetAllDto> getAll();
    List<StoryGetAllDto> getAllTraditionalWeddings();
    List<StoryGetAllDto> getAllModernWeddings();
    List<StoryGetAllDto> getAllVintageWeddings();
    List<StoryGetAllDto> getAllRusticWeddings();
    List<StoryGetAllDto> getAllBeachWeddings();
    List<StoryGetAllDto> getAllGardenWeddings();
    List<StoryGetAllDto> getAllIndoorWeddings();


}
