package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.dto.StoryDetailsDto;
import bg.softuni.WeddingApp.model.dto.StoryGetAllDto;
import bg.softuni.WeddingApp.model.entity.WeddingStory;

import java.util.List;

public interface WeddingStoryService {

    void addStory(AddWeddingStoryDTO addWeddingStoryDTO);

    WeddingStory getMostCommentedStory();

    List<StoryGetAllDto> getAll();

    StoryDetailsDto getDetails(Long id);
}
