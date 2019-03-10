package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.ProductSizeTable;

public interface ProductSizeTableRepository extends JpaRepository<ProductSizeTable, Long> {
}
