package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.Product;
import pl.website.model.ProductType;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByProductType(ProductType productType);
}
