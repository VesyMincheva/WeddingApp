package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.AddWeddingStoryDTO;
import bg.softuni.WeddingApp.model.dto.StoryDetailsDto;
import bg.softuni.WeddingApp.model.dto.StoryGetAllDto;
import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.model.entity.WeddingStory;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.repository.UserRepository;
import bg.softuni.WeddingApp.repository.WeddingStoryRepository;
import bg.softuni.WeddingApp.service.LocationService;
import bg.softuni.WeddingApp.service.StyleService;
import bg.softuni.WeddingApp.service.WeddingStoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeddingStoryServiceImpl implements WeddingStoryService {

    private final WeddingStoryRepository weddingStoryRepository;

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final LocationService locationService;
    private final StyleService styleService;

    public WeddingStoryServiceImpl(WeddingStoryRepository weddingStoryRepository,
                                   ModelMapper modelMapper,
                                   UserRepository userRepository,
                                   LocationService locationService,
                                   StyleService styleService) {
        this.weddingStoryRepository = weddingStoryRepository;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.locationService = locationService;
        this.styleService = styleService;
    }

    @Override
    public void addStory(AddWeddingStoryDTO addWeddingStoryDTO) {
//        Optional<User> author = userRepository.findUserByUsername();
        Location location = locationService.getLocation(addWeddingStoryDTO.getLocation());
        Style style = styleService.getStyle(addWeddingStoryDTO.getStyle());
        WeddingStory newWeddingStory = new WeddingStory();
//        author.ifPresent(newWeddingStory::setAuthor);
        newWeddingStory.setTitle(addWeddingStoryDTO.getTitle());
        newWeddingStory.setContent(addWeddingStoryDTO.getContent());
        newWeddingStory.setLocation(location);
        newWeddingStory.setStyle(style);

        weddingStoryRepository.save(newWeddingStory);
    }

    public WeddingStory getMostCommentedStory() {
        return weddingStoryRepository.findMostCommented().stream()
                .findFirst().orElse(null);
    }

    @Override
    public List<StoryGetAllDto> getAll() {
        return weddingStoryRepository
                .findAll()
                .stream()
                .map(story -> modelMapper.map(story,StoryGetAllDto.class))
                .toList();
    }

    @Override
    public List<StoryGetAllDto> getAllTraditionalWeddings() {
        return weddingStoryRepository
                .findAllByStyle(styleService.getStyle(WeddingStyleEnum.TRADITIONAL.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    }
    public List<StoryGetAllDto> getAllModernWeddings(){
        return weddingStoryRepository
                .findAllByStyle(styleService.getStyle(WeddingStyleEnum.MODERN.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };
    public List<StoryGetAllDto> getAllVintageWeddings(){
        return weddingStoryRepository
                .findAllByStyle(styleService.getStyle(WeddingStyleEnum.VINTAGE.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };
    public List<StoryGetAllDto> getAllRusticWeddings(){
        return weddingStoryRepository
                .findAllByStyle(styleService.getStyle(WeddingStyleEnum.RUSTIC.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };
    public List<StoryGetAllDto> getAllBeachWeddings(){
        return weddingStoryRepository
                .findAllByLocation(locationService.getLocation(LocationEnum.BEACH.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };
    public List<StoryGetAllDto> getAllGardenWeddings(){
        return weddingStoryRepository
                .findAllByLocation(locationService.getLocation(LocationEnum.GARDEN.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };
    public List<StoryGetAllDto> getAllIndoorWeddings(){
        return weddingStoryRepository
                .findAllByLocation(locationService.getLocation(LocationEnum.INDOOR.name()))
                .stream()
                .map(story -> modelMapper.map(story, StoryGetAllDto.class))
                .toList();
    };

    @Override
    public StoryDetailsDto getDetails(Long id) {
        WeddingStory byId = weddingStoryRepository.findById(id).orElse(null);

        StoryDetailsDto mappedStory = modelMapper.map(byId, StoryDetailsDto.class);
        return mappedStory;
    }
}
