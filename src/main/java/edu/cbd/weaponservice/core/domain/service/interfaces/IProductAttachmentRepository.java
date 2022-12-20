package edu.cbd.weaponservice.core.domain.service.interfaces;

import edu.cbd.weaponservice.core.domain.model.ProductAttachment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IProductAttachmentRepository extends CrudRepository<ProductAttachment, UUID> {
}
