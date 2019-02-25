package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
