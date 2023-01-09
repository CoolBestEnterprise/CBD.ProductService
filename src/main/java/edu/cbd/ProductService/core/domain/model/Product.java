package edu.cbd.ProductService.core.domain.model;

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
    private String price;

    private String description;

    private String details;

    @Column(nullable = false)
    private int count;

    private String imageLink;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
    private List<ProductAttachment> attachments;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public List<ProductAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<ProductAttachment> attachments) {
        this.attachments = attachments;
    }
}
