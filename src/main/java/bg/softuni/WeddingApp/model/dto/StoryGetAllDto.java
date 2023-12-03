package bg.softuni.WeddingApp.model.dto;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Picture;
import bg.softuni.WeddingApp.model.entity.Style;

import java.util.Set;

public class StoryGetAllDto {
    private Long id;
    private String title;
    private Set<Picture> pictures;
    private Location location;
    private Style style;

    public Location getLocation() {
        return location;
    }

    public StoryGetAllDto setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public StoryGetAllDto setStyle(Style style) {
        this.style = style;
        return this;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public StoryGetAllDto setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
        return this;
    }

    public StoryGetAllDto() {
    }

    public Long getId() {
        return id;
    }

    public StoryGetAllDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public StoryGetAllDto setTitle(String title) {
        this.title = title;
        return this;
    }
}
