package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private int id;
    @Column(name ="ORDER_NUMBER")
    private int orderNo;

    /*@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "ORDER_PRODUCT",
            joinColumns = { @JoinColumn(name = "ORDER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID") })*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ProductOrderEntity> products;
    @OneToOne
    @PrimaryKeyJoinColumn
    private BillEntity bill;

}
