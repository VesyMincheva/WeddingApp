package bg.softuni.WeddingApp.init;

import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import bg.softuni.WeddingApp.repository.StyleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StyleSeeder implements CommandLineRunner {

    private final StyleRepository styleRepository;

    public StyleSeeder(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.styleRepository.count() == 0){
            List<Style> styles = Arrays.stream(WeddingStyleEnum.values())
                    .map(Style::new)
                    .toList();

            this.styleRepository.saveAll(styles);
        }
    }
}
