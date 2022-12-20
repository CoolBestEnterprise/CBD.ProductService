package edu.cbd.weaponservice.core.domain.model;

import edu.cbd.weaponservice.core.domain.service.interfaces.IProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(IProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product(
                    UUID.randomUUID(),
                    "M4A",
                    1250.0f,
                    0.7f,
                    null
            ));
        };
    }
}
