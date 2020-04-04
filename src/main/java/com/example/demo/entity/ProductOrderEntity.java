package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ProductOrderEntity {

    @EmbeddedId
    private ProductOrderId productOrderId;
    @ManyToOne
    @MapsId("id")
    private ProductEntity product;
    @ManyToOne
    @MapsId("id")
    private OrderEntity order;
    @Column(name = "QUANTITY")
    private int quantity;

}
