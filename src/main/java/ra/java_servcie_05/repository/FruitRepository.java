package ra.java_servcie_05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.java_servcie_05.model.entity.Fruit;
@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
