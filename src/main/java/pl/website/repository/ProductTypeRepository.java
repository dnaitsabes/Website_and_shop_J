package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
}
