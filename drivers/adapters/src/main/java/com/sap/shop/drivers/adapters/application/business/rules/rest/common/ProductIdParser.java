package com.sap.shop.drivers.adapters.application.business.rules.rest.common;

import com.sap.shop.model.product.ProductId;
import jakarta.ws.rs.core.Response;

import static com.sap.shop.adapter.in.rest.common.ControllerCommons.clientErrorException;

/**
 * A parser for product IDs, throwing a {@link jakarta.ws.rs.ClientErrorException} for invalid
 * product IDs.
 *
 * @author Sven Woltmann
 */
public final class ProductIdParser {

  private ProductIdParser() {}

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
