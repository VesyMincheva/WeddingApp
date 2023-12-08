package bg.softuni.WeddingApp.model.entity;

import bg.softuni.WeddingApp.model.enums.UserRolesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRolesEnum role;

    public Role() {

    }

    public Role(UserRolesEnum userRoles) {
        this.role = userRoles;
    }

    public UserRolesEnum getRole() {
        return role;
    }

    public void setRole(UserRolesEnum name) {
        this.role = name;
    }
}
