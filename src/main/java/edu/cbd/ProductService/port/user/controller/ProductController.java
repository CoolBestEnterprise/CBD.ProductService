package edu.cbd.ProductService.port.user.controller;

import edu.cbd.ProductService.core.domain.model.Product;
import edu.cbd.ProductService.core.domain.service.impl.ProductService;
import edu.cbd.ProductService.port.user.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String create(@RequestBody Product product) {
        return productService.createProduct(product).getId().toString();
    }

    @GetMapping("product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        Product product = productService.getProductByID(uuid);

        if (product == null) {
            throw new ProductNotFoundException(uuid);
        }
        return ResponseEntity.ok(product);
    }

    @PutMapping("/product")
    public @ResponseBody String updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return productService.updateProduct(product).getId().toString();
    }

    @DeleteMapping("/product/{id}")
    public @ResponseBody String deleteProduct(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        productService.deleteProduct(uuid);
        return "Product with id: " + id + " was deleted";
    }

    @GetMapping("/products")
    public @ResponseBody Iterable<Product> getProducts() {

        return productService.getAllProducts();
    }

}
