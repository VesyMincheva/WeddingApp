package bg.softuni.WeddingApp.model.dto;

import bg.softuni.WeddingApp.model.entity.User;

import java.time.LocalDateTime;

public class ShowCommentDto {
    private Long id;
    private String created;
    private String content;
    private String createdBy;

    public ShowCommentDto() {
    }

    public ShowCommentDto(Long id, String created, String content, String createdBy) {
        this.id = id;
        this.created = created;
        this.content = content;
        this.createdBy = createdBy;
    }

    public String getCreated() {
        return created;
    }

    public Long getId() {
        return id;
    }

    public ShowCommentDto setId(Long id) {
        this.id = id;
        return this;
    }

    public ShowCommentDto setCreated(String created) {
        this.created = created;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ShowCommentDto setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public ShowCommentDto setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
}
