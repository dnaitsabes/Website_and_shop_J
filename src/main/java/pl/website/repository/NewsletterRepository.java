package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.Newsletter;

public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {
}
