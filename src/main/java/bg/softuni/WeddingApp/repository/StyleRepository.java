package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style, Long> {
    Style findByName(WeddingStyleEnum styleEnum);
}
