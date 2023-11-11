package bg.softuni.WeddingApp.init;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LocationSeeder implements CommandLineRunner {
    private final LocationRepository locationRepository;

    public LocationSeeder(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.locationRepository.count() == 0){
            List<Location> locations = Arrays.stream(LocationEnum.values())
                    .map(Location::new)
                    .toList();

            this.locationRepository.saveAll(locations);
        }
    }
}
