package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.cart;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.cart.Cart;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;
import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.port.in.cart.AddToCartUseCase;

import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.CustomerIdParser.parseCustomerId;
import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.ProductIdParser.parseProductId;

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
