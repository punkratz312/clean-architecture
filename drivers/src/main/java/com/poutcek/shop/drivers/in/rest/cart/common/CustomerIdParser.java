package com.poutcek.shop.drivers.in.rest.cart.common;

import com.poutcek.shop.drivers.adapters.application.business.rules.enterprise.business.rules.model.customer.CustomerId;
import jakarta.ws.rs.core.Response;

import static com.poutcek.shop.drivers.in.rest.cart.common.ControllerCommons.clientErrorException;

/**
 * A parser for customer IDs, throwing a {@link jakarta.ws.rs.ClientErrorException} for invalid
 * customer IDs.
 *
 * @author Sven Woltmann
 */
public final class CustomerIdParser {

  private CustomerIdParser() {}

  public static CustomerId parseCustomerId(String string) {
    try {
      return new CustomerId(Integer.parseInt(string));
    } catch (IllegalArgumentException e) {
      throw clientErrorException(Response.Status.BAD_REQUEST, "Invalid 'customerId'");
    }
  }
}
