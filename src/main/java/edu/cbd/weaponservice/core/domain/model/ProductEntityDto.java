package edu.cbd.weaponservice.core.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * A DTO for the {@link Product} entity
 */
@Data
public class ProductEntityDto implements Serializable {
    private final UUID id;
    private final String name;
    private final float basePrice;
    private final float baseWeight;
    private final List<ProductAttachmentEntityDto> attachments;
}