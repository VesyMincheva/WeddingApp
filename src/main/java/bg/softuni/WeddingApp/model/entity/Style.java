package bg.softuni.WeddingApp.model.entity;

import bg.softuni.WeddingApp.model.enums.WeddingStyleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "wedding_styles")
public class Style extends BaseEntity{
    @Column(name = "name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private WeddingStyleEnum name;

    public Style() {
    }

    public Style(WeddingStyleEnum weddingStyleEnum) {
        this.name = weddingStyleEnum;
    }

    public WeddingStyleEnum getName() {
        return name;
    }

    public void setName(WeddingStyleEnum name) {
        this.name = name;
    }


}
