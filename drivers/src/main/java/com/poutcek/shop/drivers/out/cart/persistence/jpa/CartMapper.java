package com.poutcek.shop.drivers.out.cart.persistence.jpa;

import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.Cart;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.cart.CartLineItem;
import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;

import java.util.Optional;

/**
 * Maps model carts and line items to JPA carts and line items - and vice versa.
 *
 * @author Sven Woltmann
 */
final class CartMapper {

  private CartMapper() {}

  static com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity toJpaEntity(Cart cart) {
    com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity cartJpaEntity = new com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity();
    cartJpaEntity.setCustomerId(cart.id().value());

    cartJpaEntity.setLineItems(
        cart.lineItems().stream().map(lineItem -> toJpaEntity(cartJpaEntity, lineItem)).toList());

    return cartJpaEntity;
  }

  static com.poutcek.shop.drivers.out.cart.persistence.CartLineItemJpaEntity toJpaEntity(com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity cartJpaEntity, CartLineItem lineItem) {
    com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity productJpaEntity =
            new com.poutcek.shop.drivers.out.cart.persistence.ProductJpaEntity();
    productJpaEntity.setId(lineItem.product().id().value());

    com.poutcek.shop.drivers.out.cart.persistence.CartLineItemJpaEntity entity = new com.poutcek.shop.drivers.out.cart.persistence.CartLineItemJpaEntity();
    entity.setCart(cartJpaEntity);
    entity.setProduct(productJpaEntity);
    entity.setQuantity(lineItem.quantity());

    return entity;
  }

  static Optional<Cart> toModelEntityOptional(com.poutcek.shop.drivers.out.cart.persistence.CartJpaEntity cartJpaEntity) {
    if (cartJpaEntity == null) {
      return Optional.empty();
    }

    CustomerId customerId = new CustomerId(cartJpaEntity.getCustomerId());
    Cart cart = new Cart(customerId);

    for (com.poutcek.shop.drivers.out.cart.persistence.CartLineItemJpaEntity lineItemJpaEntity : cartJpaEntity.getLineItems()) {
      cart.putProductIgnoringNotEnoughItemsInStock(
              com.poutcek.shop.drivers.out.cart.persistence.ProductMapper.toModelEntity(lineItemJpaEntity.getProduct()),
          lineItemJpaEntity.getQuantity());
    }

    return Optional.of(cart);
  }
}
