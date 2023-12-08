package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import bg.softuni.WeddingApp.repository.LocationRepository;
import bg.softuni.WeddingApp.service.LocationService;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
    @Override
    public Location getLocation(String name) {
        return locationRepository.findByName(LocationEnum.valueOf(name));
    }
}
