package com.antonbondoc.dbmigration.controller;

import com.antonbondoc.dbmigration.model.User;
import com.antonbondoc.dbmigration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
