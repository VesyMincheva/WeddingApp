package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.enums.LocationEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    Location findByName(LocationEnum name);
}
