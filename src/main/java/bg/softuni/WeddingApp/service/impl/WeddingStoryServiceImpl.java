package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.repository.WeddingStoryRepository;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import org.springframework.stereotype.Service;

@Service
public class WeddingStoryServiceImpl implements WeddingStoryService {

    private final WeddingStoryRepository weddingStoryRepository;

    public WeddingStoryServiceImpl(WeddingStoryRepository weddingStoryRepository) {
        this.weddingStoryRepository = weddingStoryRepository;
    }

    @Override
    public void addStory(AddWeddingStoryDTO addWeddingStoryDTO) {
        //TODO: implement logic
    }
}
