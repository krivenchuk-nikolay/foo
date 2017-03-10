package com.mk.sample.foo.customer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mk.sample.foo.customer.rest.dto.CustomerDto;

/**
 * Created by Mykola_Kryvenchuk on 10.03.2017.
 */
@Service
public class CustomerWebService {

    public static final String HTTP_PREFIX = "http://";

    private final RestTemplate restTemplate;
    private final String serviceUrl;

    public CustomerWebService(RestTemplate restTemplate, String serviceUrl) {
        this.restTemplate = restTemplate;
        this.serviceUrl = serviceUrl.startsWith(HTTP_PREFIX) ? serviceUrl : HTTP_PREFIX + serviceUrl;
    }

    public Collection<CustomerDto> getAllCustomers() {
        Collection response = restTemplate.getForObject(this.serviceUrl + "/customers", Collection.class);
        return response;
    }
}
