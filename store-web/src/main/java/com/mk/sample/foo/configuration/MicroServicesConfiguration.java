package com.mk.sample.foo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.mk.sample.foo.customer.CustomerWebService;

/**
 * Created by Mykola_Kryvenchuk on 10.03.2017.
 */
@Configuration
@EnableDiscoveryClient
public class MicroServicesConfiguration {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Autowired
    public CustomerWebService customerWebService(RestTemplate restTemplate) {
        return new CustomerWebService(restTemplate, "CUSTOMER-SERVICE");
    }

}
