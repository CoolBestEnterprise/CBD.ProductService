package edu.cbd.ProductService.core.domain.service.impl;

import edu.cbd.ProductService.core.domain.model.ProductAttachment;
import edu.cbd.ProductService.core.domain.service.interfaces.IProductAttachmentRepository;
import edu.cbd.ProductService.core.domain.service.interfaces.IProductAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductAttachmentService implements IProductAttachmentService {

    private final IProductAttachmentRepository productAttachmentRepository;

    @Autowired
    public ProductAttachmentService(IProductAttachmentRepository productAttachmentRepository) {
        this.productAttachmentRepository = productAttachmentRepository;
    }

    @Override
    public Iterable<ProductAttachment> getAllProductAttachments() {
        return productAttachmentRepository.findAll();
    }

    @Override
    public ProductAttachment getProductAttachmentByID(UUID id) {
        return productAttachmentRepository.findById(id).orElse(null);
    }

    @Override
    public ProductAttachment createProductAttachment(ProductAttachment productAttachment) {
        return productAttachmentRepository.save(productAttachment);
    }

    @Override
    public ProductAttachment updateProductAttachment(ProductAttachment productAttachment) {
        return productAttachmentRepository.save(productAttachment);
    }

    @Override
    public void deleteProductAttachment(UUID id) {
        productAttachmentRepository.delete(getProductAttachmentByID(id));
    }
}
