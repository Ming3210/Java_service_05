package ra.java_servcie_05.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.java_servcie_05.model.dto.FruitDTO;
import ra.java_servcie_05.model.entity.Fruit;
import ra.java_servcie_05.repository.FruitRepository;
import ra.java_servcie_05.service.FruitService;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public List<FruitDTO> getAllFruits() {
        return fruitRepository.findAll().stream()
                .map(fruit -> new FruitDTO(fruit.getId(), fruit.getName(), fruit.getPrice(), fruit.getStock(),fruit.isStatus(),fruit.getCreatedAt()))
                .toList();
    }

    @Override
    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fruit not found with id: " + id));
    }

    @Override
    public Fruit createFruit(Fruit fruit) {
        if (fruitRepository.existsById(fruit.getId())) {
            throw new RuntimeException("Fruit already exists with id: " + fruit.getId());
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Long id, Fruit fruit) {
        Fruit existingFruit = fruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fruit not found with id: " + id));
        existingFruit.setName(fruit.getName());
        existingFruit.setPrice(fruit.getPrice());
        existingFruit.setStock(fruit.getStock());
        existingFruit.setStatus(fruit.isStatus());
        existingFruit.setCreatedAt(fruit.getCreatedAt());
        return fruitRepository.save(existingFruit);
    }

    @Override
    public void deleteFruit(Long id) {
        Fruit fruit = fruitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fruit not found with id: " + id));
        fruitRepository.delete(fruit);
    }
}
