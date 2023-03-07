package me.github.srvenient.springbootweb.controller;

import me.github.srvenient.springbootweb.entity.User;
import me.github.srvenient.springbootweb.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService = new UserService();

    @GetMapping("/login")
    public List<User> getUser() {
        userService.getUsers().clear();

        userService.addUser(new User("test", "test@gmail.com", "tod"));
        userService.addUser(new User("srvenient", "test1@gmail.com", "totty"));

        return userService.getUsers();

    }
}