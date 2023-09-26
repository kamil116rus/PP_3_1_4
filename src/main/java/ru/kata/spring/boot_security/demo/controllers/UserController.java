package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.kata.spring.boot_security.demo.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


}
