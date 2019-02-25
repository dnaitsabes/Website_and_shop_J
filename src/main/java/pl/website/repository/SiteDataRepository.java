package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.SiteData;

public interface SiteDataRepository extends JpaRepository<SiteData, Long> {
}
