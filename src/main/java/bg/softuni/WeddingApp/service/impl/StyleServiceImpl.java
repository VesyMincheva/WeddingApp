package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.repository.StyleRepository;
import bg.softuni.WeddingApp.service.StyleService;
import org.springframework.stereotype.Service;

@Service
public class StyleServiceImpl implements StyleService {

    private final StyleRepository styleRepository;

    public StyleServiceImpl(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }
    @Override
    public Style getStyle(String name) {
        return styleRepository.findByName(WeddingStyleEnum.valueOf(name));
    }
}
