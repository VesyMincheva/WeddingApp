package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.enums.UserRolesEnum;
import bg.softuni.WeddingApp.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole (UserRolesEnum role);
}
