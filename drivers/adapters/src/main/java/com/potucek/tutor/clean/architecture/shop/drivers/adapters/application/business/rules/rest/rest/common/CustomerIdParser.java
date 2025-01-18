package com.potucek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.rest.rest.common;

import com.poutcek.tutor.clean.architecture.shop.drivers.adapters.application.business.rules.enterprise.business.rules.customer.CustomerId;

public final class CustomerIdParser {

    private CustomerIdParser() {
    }

    public static CustomerId parseCustomerId(String string) {
        return new CustomerId(Integer.parseInt(string));
//        try {
//        } catch (IllegalArgumentException e) {
//            throw clientErrorException(Response.Status.BAD_REQUEST, "Invalid 'customerId'");
//        }
    }
}
