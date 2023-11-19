package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.WeddingStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeddingStoryRepository extends JpaRepository<WeddingStory, Long> {

    @Query("SELECT w FROM WeddingStory w ORDER BY size(w.comments) DESC")
    List<WeddingStory> findMostCommented();
}
