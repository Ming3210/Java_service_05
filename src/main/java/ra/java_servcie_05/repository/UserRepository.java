package ra.java_servcie_05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.java_servcie_05.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
