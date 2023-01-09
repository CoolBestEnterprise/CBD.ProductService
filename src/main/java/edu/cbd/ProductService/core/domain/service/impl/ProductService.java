package edu.cbd.ProductService.core.domain.service.impl;

import edu.cbd.ProductService.core.domain.model.Product;
import edu.cbd.ProductService.core.domain.service.interfaces.IProductRepository;
import edu.cbd.ProductService.core.domain.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    @Autowired
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();

    }

    @Override
    public Product getProductByID(UUID id){
        Optional<Product> product = productRepository.findById(id);
        //TODO Negotiate if throwing NULL in the Service is okay or if we should throw a custom exception
        return product.orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(UUID id) {
        productRepository.delete(getProductByID(id));
    }
}
