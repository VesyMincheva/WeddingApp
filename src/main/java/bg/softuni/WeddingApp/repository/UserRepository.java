package bg.softuni.WeddingApp.repository;

import bg.softuni.WeddingApp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);

    Optional<User> findUserByUsername(String username);
}
