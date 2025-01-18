package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.rest.cart;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.cart.Cart;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.customer.CustomerId;
import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.rules.product.ProductId;
import com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rules.port.in.cart.AddToCartUseCase;

import static com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.rest.common.CustomerIdParser.parseCustomerId;
import static com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.rest.common.ProductIdParser.parseProductId;

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
