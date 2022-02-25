package dev.ahmed.case3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author  Ahmed Bughra
 * @Created 2/25/2022 - 3:29 PM
 * @Project case3-UyCoder
 */

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(generator = "Product")
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "PRODUCT_NAME", length = 100, nullable = false)
    private String productName;

    @Column(name = "PRICE", length = 5, nullable = false)
    private Long price;

}
