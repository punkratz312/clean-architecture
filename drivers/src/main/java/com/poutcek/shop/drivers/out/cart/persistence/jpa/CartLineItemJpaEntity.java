package com.poutcek.shop.drivers.out.cart.persistence.jpa;

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

  @ManyToOne
  private com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity cart;

    @ManyToOne
    private com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity product;

  private int quantity;
}
