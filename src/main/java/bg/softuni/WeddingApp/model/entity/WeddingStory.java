package bg.softuni.WeddingApp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "wedding_stories")
public class WeddingStory extends BaseEntity{
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private User author;

    @ManyToOne(targetEntity = Location.class)
    private Location location;

    @ManyToOne
    private Style style;

    @OneToMany(targetEntity = Comment.class, mappedBy = "story", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;

    @OneToMany(targetEntity = Picture.class, mappedBy = "story", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Picture> pictures;


    public WeddingStory() {
        this.comments = new ArrayList<>();
        this.pictures = new HashSet<>();
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public WeddingStory setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public WeddingStory setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
