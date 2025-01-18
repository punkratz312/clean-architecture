package com.potucek.shop.drivers.adapters.application.business.rules.rest.cart;

import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.cart.Cart;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.customer.CustomerId;
import com.potucek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.model.product.ProductId;
import com.potucek.shop.drivers.adapters.application.business.rules.rules.port.in.api.cart.AddToCartUseCase;

import static com.potucek.shop.drivers.adapters.application.business.rules.rest.common.CustomerIdParser.parseCustomerId;
import static com.potucek.shop.drivers.adapters.application.business.rules.rest.common.ProductIdParser.parseProductId;

/**
 * REST controller for all shopping cart use cases.
 *
 * @author Sven Woltmann
 */
public class AddToCartControllerAdapter {

    private final AddToCartUseCase addToCartUseCase;

    public AddToCartControllerAdapter(AddToCartUseCase addToCartUseCase) {
        this.addToCartUseCase = addToCartUseCase;
    }

    public CartWebModel addLineItem(
            String customerIdString,
            String productIdString,
            int quantity) {
        CustomerId customerId = parseCustomerId(customerIdString);
        ProductId productId = parseProductId(productIdString);

        try {
            Cart cart = addToCartUseCase.addToCart(customerId, productId, quantity);
            return CartWebModel.fromDomainModel(cart);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
}
