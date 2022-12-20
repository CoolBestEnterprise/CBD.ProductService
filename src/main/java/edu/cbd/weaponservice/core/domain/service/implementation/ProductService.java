package edu.cbd.weaponservice.core.domain.service.implementation;

import edu.cbd.weaponservice.core.domain.model.Product;
import edu.cbd.weaponservice.core.domain.service.interfaces.IProductRepository;
import edu.cbd.weaponservice.core.domain.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService implements IProductService {
    private final IProductRepository productRepository;

    @Autowired
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());

    }

    @Override
    public Product getProductByID(UUID id) throws ErrorResponseException {

        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        throw new ErrorResponseException(HttpStatus.NOT_FOUND);
    }

    @Override
    public Product createProduct(Product product) throws ErrorResponseException {
        return null;
    }

    @Override
    public Product updateProduct(Product product) throws ErrorResponseException {
        return null;
    }

    @Override
    public void deleteProduct(UUID id) throws ErrorResponseException {
    }
}
