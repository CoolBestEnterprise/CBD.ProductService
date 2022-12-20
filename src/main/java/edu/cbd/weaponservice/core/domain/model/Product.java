package edu.cbd.weaponservice.core.domain.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Builder
public class Product {

    @Id
    @Column(nullable = false, unique = true, columnDefinition = "uuid")
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float basePrice;

    @Column(nullable = false)
    private float baseWeight;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<ProductAttachment> attachments;
}
