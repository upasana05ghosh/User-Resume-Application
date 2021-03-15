package com.userresume.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userresume.constants.Constants;
import com.userresume.entity.User;
import com.userresume.manager.UserManager;

@RestController
@RequestMapping(value = Constants.USER_BASE_URL , produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserManager userManager;

    @PostMapping(value = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody User input) {
        userManager.createUser(input);
        return null;
    }

    @GetMapping(value = "/get/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userManager.getUser(userId);
    }

    @PostMapping(value = "/delete/{userId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String deleteUser(@PathVariable Long userId) {
        userManager.deleteUser(userId);
        return null;
    }

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateUser(@RequestBody User input) {
        userManager.updateUser(input);
        return null;
    }

    @GetMapping(value = "/all")
    public List<User> getAllUser() {
        log.info("User request receiveds");
        List<User> users = userManager.getAllUser();
        return users;
    }

    @GetMapping(value = "/greetings")
    public String greetings() {
        return "HI there";
    }
}
