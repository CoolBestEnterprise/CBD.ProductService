package edu.cbd.ProductService.core.domain.service.interfaces;


import edu.cbd.ProductService.core.domain.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface IProductRepository extends CrudRepository<Product, UUID> {

}
