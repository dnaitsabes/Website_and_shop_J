package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
