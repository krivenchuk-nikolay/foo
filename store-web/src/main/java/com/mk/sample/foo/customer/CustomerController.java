package com.mk.sample.foo.customer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.sample.foo.customer.rest.dto.CustomerDto;

/**
 * Created by Mykola_Kryvenchuk on 07.03.2017.
 */
@Controller
@RequestMapping(CustomerController.USERS_CONTROLLER_MAPPING)
public class CustomerController {
    public static final String USERS_CONTROLLER_MAPPING = "/users";

    @Autowired
    private CustomerWebService customerWebService;

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getUsersList() {
        Collection<CustomerDto> allCustomers = customerWebService.getAllCustomers();
        return new ModelAndView("user-list", "userList", allCustomers);
    }

}
