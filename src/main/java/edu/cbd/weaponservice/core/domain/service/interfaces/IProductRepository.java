package edu.cbd.weaponservice.core.domain.service.interfaces;


import edu.cbd.weaponservice.core.domain.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface IProductRepository extends CrudRepository<Product, UUID> {

}
