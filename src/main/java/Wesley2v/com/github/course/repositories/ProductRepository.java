package Wesley2v.com.github.course.repositories;

import Wesley2v.com.github.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
