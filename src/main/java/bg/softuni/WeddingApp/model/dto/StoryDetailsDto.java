package bg.softuni.WeddingApp.model.dto;

import bg.softuni.WeddingApp.model.entity.*;

import java.util.List;
import java.util.Set;

public class StoryDetailsDto {
    private Long id;
    private String title;
    private String content;
    private Location location;
    private Style style;
    private List<Comment> comments;
    private Set<Picture> pictures;

    private User author;

    public User getAuthor() {
        return author;
    }

    public StoryDetailsDto setAuthor(User author) {
        this.author = author;
        return this;
    }

    public StoryDetailsDto() {
    }

    public Long getId() {
        return id;
    }

    public StoryDetailsDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public StoryDetailsDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public StoryDetailsDto setContent(String content) {
        this.content = content;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public StoryDetailsDto setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public StoryDetailsDto setStyle(Style style) {
        this.style = style;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public StoryDetailsDto setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public StoryDetailsDto setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
        return this;
    }
}
