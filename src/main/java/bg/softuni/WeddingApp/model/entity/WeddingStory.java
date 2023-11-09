package bg.softuni.WeddingApp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "wedding_stories")
public class WeddingStory extends BaseEntity{
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private User author;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Style style;


    public WeddingStory() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
