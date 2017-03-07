package com.mk.sample.foo.controller.user;

import java.time.LocalDate;
import java.util.Collections;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mk.sample.foo.rest.user.dto.UserDto;

/**
 * Created by Mykola_Kryvenchuk on 07.03.2017.
 */
@Controller
@RequestMapping(UserController.USERS_CONTROLLER_MAPPING)
public class UserController {
    public static final String USERS_CONTROLLER_MAPPING = "/users";

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getUsersList() {
        UserDto userDto = new UserDto("Nick", LocalDate.now());
        return new ModelAndView("user-list", "userList", Collections.singletonList(userDto));
    }

}
