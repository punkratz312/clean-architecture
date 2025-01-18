package com.poutcek.shop.drivers.in.rest.cart.common;

/**
 * An error entity with a status and message returned via REST API in case of an error.
 *
 * @author Sven Woltmann
 */
public record ErrorEntity(int httpStatus, String errorMessage) {}
