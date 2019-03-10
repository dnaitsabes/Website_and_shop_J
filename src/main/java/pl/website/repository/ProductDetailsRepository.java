package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {
}
