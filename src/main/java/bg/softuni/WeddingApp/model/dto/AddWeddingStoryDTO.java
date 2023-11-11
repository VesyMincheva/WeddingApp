package bg.softuni.WeddingApp.model.dto;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Style;

import java.time.LocalDate;

public class AddWeddingStoryDTO {
    private String title;

    private LocalDate date;

    private String content;

    private Location location;

    private Style style;

    public AddWeddingStoryDTO() {
    }

    public String getTitle() {
        return title;
    }

    public AddWeddingStoryDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public AddWeddingStoryDTO setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AddWeddingStoryDTO setContent(String content) {
        this.content = content;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public AddWeddingStoryDTO setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Style getStyle() {
        return style;
    }

    public AddWeddingStoryDTO setStyle(Style style) {
        this.style = style;
        return this;
    }
}
