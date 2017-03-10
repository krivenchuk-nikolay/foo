package com.mk.sample.foo.customer.rest;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.sample.foo.customer.rest.dto.CustomerDto;

/**
 * Created by Mykola_Kryvenchuk on 07.03.2017.
 */
@RestController
@RequestMapping(value = CustomerRest.CUSTOMERS_URL_MAPPING, produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerRest {

    public static final String CUSTOMERS_URL_MAPPING = "/customers";

    @GetMapping
    public Collection<CustomerDto> getAllUsers() {
        return Collections.singletonList(new CustomerDto("User123", LocalDate.now()));
    }

}
