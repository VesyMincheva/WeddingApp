package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.Comment;
import bg.softuni.WeddingApp.model.entity.WeddingStory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByStory(WeddingStory weddingStory);
}
