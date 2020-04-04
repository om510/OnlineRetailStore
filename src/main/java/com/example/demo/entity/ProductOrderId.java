package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ProductOrderId implements Serializable {

    @Column(name="PRODUCT_ID")
    private int productId;
    @Column(name="ORDER_ID")
    private int orderId;
}
