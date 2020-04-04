package com.example.demo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BILL")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="BILL_ID")
    private Integer bill_id;
    @Column(name = "BILL_NO")
    private Integer billNo;
    @OneToOne(mappedBy="bill")
    private OrderEntity order;
}
