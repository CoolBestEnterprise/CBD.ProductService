package edu.cbd.ProductService.core.domain.model;

import edu.cbd.ProductService.core.domain.service.interfaces.IProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.UUID;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(IProductRepository productRepository) {
        return args -> productRepository.save(new Product(
                UUID.randomUUID(),
                "Product 1",
                "400€",
                "This is a product",
                "Product Detail",
                10,
                "https://www.google.com",
                new ArrayList<>()
        ));
    }
}
