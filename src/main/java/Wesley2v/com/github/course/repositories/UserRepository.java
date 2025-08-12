package Wesley2v.com.github.course.repositories;

import Wesley2v.com.github.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
