package Wesley2v.com.github.course.repositories;

import Wesley2v.com.github.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
