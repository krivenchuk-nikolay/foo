package com.mk.sample.foo.order.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mykola_Kryvenchuk on 10.03.2017.
 */
@RestController
@RequestMapping(OrderRest.ORDERS_URL_MAPPING)
public class OrderRest {

    public static final String ORDERS_URL_MAPPING = "/orders";

    @GetMapping
    public String getAllOrders() {
        return "stub";
    }

}
