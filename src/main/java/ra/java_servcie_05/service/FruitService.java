package ra.java_servcie_05.service;

import ra.java_servcie_05.model.dto.FruitDTO;
import ra.java_servcie_05.model.entity.Fruit;

import java.util.List;

public interface FruitService {
     List<FruitDTO> getAllFruits();
     Fruit getFruitById(Long id);
     Fruit createFruit(Fruit fruit);
     Fruit updateFruit(Long id, Fruit fruit);
     void deleteFruit(Long id);
}
