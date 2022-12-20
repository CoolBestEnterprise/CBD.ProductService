package edu.cbd.weaponservice.core.domain.service.interfaces;

import edu.cbd.weaponservice.core.domain.model.Product;
import org.springframework.web.ErrorResponseException;

import java.util.List;
import java.util.UUID;

public interface IProductService {

    List<Product> getAllProducts();

    Product getProductByID(UUID id) throws ErrorResponseException;

    Product createProduct(Product product) throws ErrorResponseException;

    Product updateProduct(Product product) throws ErrorResponseException;

    //TODO Negotiate if void can be returned or if we should return the deleted product
    void deleteProduct(UUID id) throws ErrorResponseException;
}
