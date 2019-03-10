package pl.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.website.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
