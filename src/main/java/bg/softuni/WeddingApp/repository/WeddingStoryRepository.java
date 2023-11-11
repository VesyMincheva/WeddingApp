package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.WeddingStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeddingStoryRepository extends JpaRepository<WeddingStory, Long> {


}
