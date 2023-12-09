package bg.softuni.WeddingApp.model.dto;
public class AddCommentDto {
    private String content;

    public AddCommentDto() {
    }

    public String getContent() {
        return content;
    }

    public AddCommentDto setContent(String content) {
        this.content = content;
        return this;
    }

}
