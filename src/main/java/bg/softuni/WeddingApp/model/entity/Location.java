package bg.softuni.WeddingApp.model.entity;

import bg.softuni.WeddingApp.model.enums.LocationEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location extends BaseEntity{
    @Column(name = "name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private LocationEnum name;


    public Location() {
    }

    public Location(LocationEnum locationEnum) {
        this.name = locationEnum;
    }

    public LocationEnum getName() {
        return name;
    }

    public void setName(LocationEnum name) {
        this.name = name;
    }


}
