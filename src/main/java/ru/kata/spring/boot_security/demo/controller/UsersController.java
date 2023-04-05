package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.servise.UsersService;

import java.security.Principal;


@Controller
@RequestMapping
public class UsersController {

    private final UsersService userService;

    @Autowired
    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping({"/user"})
    public String showUserInfo(Principal principal, ModelMap model) {
        model.addAttribute("user", userService.findByUsername(principal.getName()));
        return "user";
    }
}
