package com.potucek.tutor.clean.architecture.shop.drivers.in.rest.cart.persistence.

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * JPA entity class for a shopping cart.
 *
 * @author Sven Woltmann
 */
@Entity
@Table(name = "Cart")
@Getter
@Setter
public class CartJpaEntity {

  @Id private int customerId;

  @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CartLineItemJpaEntity> lineItems;
}
