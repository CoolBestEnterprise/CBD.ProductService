package edu.cbd.ProductService.core.domain.service.interfaces;

import edu.cbd.ProductService.core.domain.model.Product;

import java.util.UUID;

public interface IProductService {

    Iterable<Product> getAllProducts();

    Product getProductByID(UUID id);

    Product createProduct(Product product);

    Product updateProduct(Product product);

    //TODO Negotiate if void can be returned or if we should return the deleted product
    void deleteProduct(UUID id);
}
