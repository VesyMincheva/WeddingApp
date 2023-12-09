package bg.softuni.WeddingApp.service.impl;

import bg.softuni.WeddingApp.model.dto.AddCommentDto;
import bg.softuni.WeddingApp.model.entity.Comment;
import bg.softuni.WeddingApp.model.entity.User;
import bg.softuni.WeddingApp.repository.CommentRepository;
import bg.softuni.WeddingApp.repository.WeddingStoryRepository;
import bg.softuni.WeddingApp.service.CommentService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final WeddingStoryRepository weddingStoryRepository;

    public CommentServiceImpl(CommentRepository commentRepository,
                              WeddingStoryRepository weddingStoryRepository) {
        this.commentRepository = commentRepository;
        this.weddingStoryRepository = weddingStoryRepository;
    }

    public List<Comment> getAllCommentsByStory(Long storyId){
        return commentRepository.findAllByStory(weddingStoryRepository.getById(storyId));
    }

    public Comment addComment (AddCommentDto addCommentDto, User author, Long storyId){
        Comment comment = new Comment();
        comment.setCreated(LocalDateTime.now());
        comment.setCreatedBy(author);
        comment.setStory(weddingStoryRepository.getById(storyId));
        comment.setContent(addCommentDto.getContent());
        commentRepository.save(comment);

        return comment;
    }
}
