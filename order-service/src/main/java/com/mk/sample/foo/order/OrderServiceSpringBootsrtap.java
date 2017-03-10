package com.mk.sample.foo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Mykola_Kryvenchuk on 10.03.2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceSpringBootsrtap {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceSpringBootsrtap.class, args);
    }

}
