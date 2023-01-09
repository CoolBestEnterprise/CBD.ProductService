package edu.cbd.ProductService.core.domain.service.interfaces;

import edu.cbd.ProductService.core.domain.model.ProductAttachment;

import java.util.UUID;

public interface IProductAttachmentService {

    Iterable<ProductAttachment> getAllProductAttachments();

    ProductAttachment getProductAttachmentByID(UUID id);

    ProductAttachment createProductAttachment(ProductAttachment productAttachment);

    ProductAttachment updateProductAttachment(ProductAttachment productAttachment);

    //TODO Negotiate if void can be returned or if we should return the deleted product
    void deleteProductAttachment(UUID id);
}
