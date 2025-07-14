package ra.java_servcie_05.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FruitDTO {
    private Long id;

    private String name;

    private Double price;

    private Integer stock;

    private boolean status;

    private LocalDate createdAt;
}
