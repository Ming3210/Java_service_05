package ra.java_servcie_05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.java_servcie_05.model.dto.ProductListDTO;
import ra.java_servcie_05.model.entity.Product;
import ra.java_servcie_05.service.ProductService;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductsJson() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/products/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ProductListDTO getProductsXml() {
        return new ProductListDTO(productService.getAllProducts());
    }
}
