package com.potucek.shop.drivers.in.rest.cart.persistence.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * JPA entity class for a shopping cart line item.
 *
 * @author Sven Woltmann
 */
@Entity
@Table(name = "CartLineItem")
@Getter
@Setter
public class CartLineItemJpaEntity {

  @Id @GeneratedValue private Integer id;

  @ManyToOne private com.potucek.shop.drivers.in.rest.cart.persistence.jpa.CartJpaEntity cart;

    @ManyToOne
    private com.potucek.shop.drivers.in.rest.cart.persistence.jpa.ProductJpaEntity product;

  private int quantity;
}
