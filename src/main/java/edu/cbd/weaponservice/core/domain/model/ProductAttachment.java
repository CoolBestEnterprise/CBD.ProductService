package edu.cbd.weaponservice.core.domain.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@JsonPropertyOrder({"id", "name", "type", "price", "weight", "origin", "color", "effectiveness"})
@Entity
@Builder
public class ProductAttachment {

    @Id
    @Column(nullable = false, unique = true, columnDefinition = "uuid")
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private float price;
    @Column(nullable = false)
    private float weight;
    @Column(nullable = false)
    private String origin;
    @Column(nullable = false)
    private String Color;
    @Column(nullable = false)
    private int effectiveness;
}
