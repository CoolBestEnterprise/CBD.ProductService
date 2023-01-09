package edu.cbd.ProductService.port.user.controller;

import edu.cbd.ProductService.core.domain.model.Product;
import edu.cbd.ProductService.core.domain.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/", ""})
    public ResponseEntity<Iterable<Product>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
