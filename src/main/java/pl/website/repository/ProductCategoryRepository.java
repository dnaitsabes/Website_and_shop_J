package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
