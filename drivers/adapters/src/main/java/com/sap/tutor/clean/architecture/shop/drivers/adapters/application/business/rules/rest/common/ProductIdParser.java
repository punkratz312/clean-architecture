package com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common;

import com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.product.ProductId;

import static com.sap.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.common.ControllerCommons.clientErrorException;

/**
 * A parser for product IDs, throwing a {@link jakarta.ws.rs.ClientErrorException} for invalid
 * product IDs.
 *
 * @author Sven Woltmann
 */
public final class ProductIdParser {

    private ProductIdParser() {
    }

    public static ProductId parseProductId(String string) {
        if (string == null) {
            throw clientErrorException(Response.Status.BAD_REQUEST, "Missing 'productId'");
        }

        try {
            return new ProductId(string);
        } catch (IllegalArgumentException e) {
            throw clientErrorException(Response.Status.BAD_REQUEST, "Invalid 'productId'");
        }
    }
}
