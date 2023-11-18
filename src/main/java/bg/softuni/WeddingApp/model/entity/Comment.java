package bg.softuni.WeddingApp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
@Entity
@Table(name = "comments")
public class Comment extends BaseEntity{

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "text_content", columnDefinition = "TEXT", nullable = false)
    private String content;

    @ManyToOne
    private User createdBy;

    @ManyToOne
    private WeddingStory story;

    public User getCreatedBy() {
        return createdBy;
    }

    public Comment setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public WeddingStory getStory() {
        return story;
    }

    public Comment setStory(WeddingStory story) {
        this.story = story;
        return this;
    }

    public Comment() {
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return createdBy;
    }

    public void setAuthor(User author) {
        this.createdBy = author;
    }

}
