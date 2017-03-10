package com.mk.sample.foo.customer.rest.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Mykola_Kryvenchuk on 07.03.2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String name;
    private LocalDate dob;
}
