package ra.java_servcie_05.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table (name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fruit {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private Integer stock;

    private boolean status;

    private LocalDate createdAt;
}
