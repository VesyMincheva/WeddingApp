package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.model.entity.WeddingStory;
import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.repository.WeddingStoryRepository;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import bg.softuni.WeddingApp.session.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeddingStoryServiceImpl implements WeddingStoryService {

    private final WeddingStoryRepository weddingStoryRepository;
    private final LoggedUser loggedUser;

    private final ModelMapper modelMapper;

    private final UserRepository userRepository;
    private final LocationServiceImpl locationService;
    private final StyleServiceImpl styleService;

    public WeddingStoryServiceImpl(WeddingStoryRepository weddingStoryRepository, LoggedUser loggedUser, ModelMapper modelMapper, UserRepository userRepository, LocationServiceImpl locationService, StyleServiceImpl styleService) {
        this.weddingStoryRepository = weddingStoryRepository;
        this.loggedUser = loggedUser;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.locationService = locationService;
        this.styleService = styleService;
    }

    @Override
    public void addStory(AddWeddingStoryDTO addWeddingStoryDTO) {
        Optional<User> author = userRepository.findUserByUsername(loggedUser.getUsername());
        Location location = locationService.getLocation(addWeddingStoryDTO.getLocation());
        Style style = styleService.getStyle(addWeddingStoryDTO.getStyle());
        WeddingStory newWeddingStory = new WeddingStory();
        author.ifPresent(newWeddingStory::setAuthor);
        newWeddingStory.setTitle(addWeddingStoryDTO.getTitle());
        newWeddingStory.setContent(addWeddingStoryDTO.getContent());
        newWeddingStory.setLocation(location);
        newWeddingStory.setStyle(style);

        weddingStoryRepository.save(newWeddingStory);
    }

    public WeddingStory getMostCommentedStory() {
        return weddingStoryRepository.findMostCommented().get(0);
    }
}
