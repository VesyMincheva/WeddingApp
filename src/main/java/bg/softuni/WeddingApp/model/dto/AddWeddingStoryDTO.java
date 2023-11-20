package bg.softuni.WeddingApp.model.dto;

import bg.softuni.WeddingApp.model.entity.Location;
import bg.softuni.WeddingApp.model.entity.Style;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class AddWeddingStoryDTO {

    @NotNull
    private String title;
    @NotNull
    private String content;
    @NotNull
    private String location;
    @NotNull
    private String style;

    public AddWeddingStoryDTO() {
    }

    public String getTitle() {
        return title;
    }

    public AddWeddingStoryDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AddWeddingStoryDTO setContent(String content) {
        this.content = content;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public AddWeddingStoryDTO setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public AddWeddingStoryDTO setStyle(String style) {
        this.style = style;
        return this;
    }
}
