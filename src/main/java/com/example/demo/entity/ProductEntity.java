package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID")
    private int id;
    @Column(name ="PRODUCT_NAME")
    private String prodName;
    @Column(name="PRICE")
    private double price;
    @Column(name="CATEGORY")
    private String category;
    @Column(name="QUANTITY")
    private int quantity;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ProductOrderEntity> orders;

}
