package bg.softuni.WeddingApp.web;

import bg.softuni.WeddingApp.model.dto.ShowCommentDto;
import bg.softuni.WeddingApp.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

@RestController
public class CommentsRestController {
    private final CommentService commentService;

    public CommentsRestController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/api/{storyId}/comments")
    public ResponseEntity<List<ShowCommentDto>> getStoryComments (@PathVariable("storyId") Long storyId){
        List<ShowCommentDto> commentsToShow = commentService.getAllCommentsByStory(storyId)
                .stream().map(
                        c -> new ShowCommentDto(c.getId(),
                                c.getCreated().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")),
                                c.getContent(),
                                c.getAuthor().getUsername())
                ).collect(Collectors.toList());
        return ResponseEntity.ok(commentsToShow);
    }
}
