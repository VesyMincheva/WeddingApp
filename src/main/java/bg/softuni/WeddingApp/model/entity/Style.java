package bg.softuni.WeddingApp.model.entity;

import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "wedding_styles")
public class Style extends BaseEntity{
    @Column(name = "name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private WeddingStyleEnum name;

    @Column(name = "description", nullable = true, columnDefinition = "text")
    private String description;


    public Style() {
    }

    public WeddingStyleEnum getName() {
        return name;
    }

    public void setName(WeddingStyleEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
