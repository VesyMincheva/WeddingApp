package bg.softuni.WeddingApp.model.dto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public class AddWeddingStoryDTO {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String location;
    @NotBlank
    private String style;

    private MultipartFile picture;

       public AddWeddingStoryDTO() {
    }

    public AddWeddingStoryDTO(String title, String content, String location, String style, MultipartFile picture) {
        this.title = title;
        this.content = content;
        this.location = location;
        this.style = style;
        this.picture = picture;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public AddWeddingStoryDTO setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
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
