package bg.softuni.WeddingApp.service;

import bg.softuni.WeddingApp.model.dto.AddCommentDto;
import bg.softuni.WeddingApp.model.entity.Comment;
import bg.softuni.WeddingApp.model.entity.User;

import java.util.List;

public interface CommentService {

    List<Comment> getAllCommentsByStory(Long storyId);
    Comment addComment (AddCommentDto addCommentDto, User author, Long storyId);
}
