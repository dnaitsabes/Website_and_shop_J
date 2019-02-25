package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
