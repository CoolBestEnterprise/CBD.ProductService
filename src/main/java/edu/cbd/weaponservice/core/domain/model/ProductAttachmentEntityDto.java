package edu.cbd.weaponservice.core.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link ProductAttachment} entity
 */
@Data
public class ProductAttachmentEntityDto implements Serializable {
    private final UUID id;
    private final String name;
    private final String type;
    private final float price;
    private final float weight;
    private final String origin;
    private final String Color;
    private final int effectiveness;
}