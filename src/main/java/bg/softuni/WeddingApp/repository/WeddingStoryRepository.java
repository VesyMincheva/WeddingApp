package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Style;
import bg.softuni.WeddingApp.model.entity.WeddingStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeddingStoryRepository extends JpaRepository<WeddingStory, Long> {

    @Query("SELECT w FROM WeddingStory w ORDER BY size(w.comments) DESC")
    List<WeddingStory> findMostCommented();

    List<WeddingStory> findAllByStyle(Style style);
    List<WeddingStory> findAllByLocation(Location location);
    WeddingStory getById(Long id);

}
