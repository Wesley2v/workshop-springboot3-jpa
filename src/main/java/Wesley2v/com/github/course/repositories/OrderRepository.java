package Wesley2v.com.github.course.repositories;

import Wesley2v.com.github.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
