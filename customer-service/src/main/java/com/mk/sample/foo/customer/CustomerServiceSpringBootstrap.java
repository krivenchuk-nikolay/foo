package com.mk.sample.foo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Mykola_Kryvenchuk on 10.03.2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerServiceSpringBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceSpringBootstrap.class, args);
    }

}
