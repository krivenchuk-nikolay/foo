package com.mk.sample.foo.rest;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.sample.foo.rest.user.dto.UserDto;

/**
 * Created by Mykola_Kryvenchuk on 07.03.2017.
 */
@RestController
@RequestMapping(value = UserRest.USERS_URL_MAPPING, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserRest {

    public static final String USERS_URL_MAPPING = "/users";

    @GetMapping
    public Collection<UserDto> getAllUsers() {
        return Collections.singletonList(new UserDto("User123", LocalDate.now()));
    }

}
