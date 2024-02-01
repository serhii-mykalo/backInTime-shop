package ua.shop.backInTime.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.shop.backInTime.user.service.UserService;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<User> getAllUsers() {
//        return userService.getAllUsers;
//    }
}
