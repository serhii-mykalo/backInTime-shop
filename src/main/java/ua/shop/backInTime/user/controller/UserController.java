package ua.shop.backInTime.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.shop.backInTime.user.User;
import ua.shop.backInTime.user.repository.UserRepository;
import ua.shop.backInTime.user.service.UserService;

@Controller
@RequestMapping(path = "/demo")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String password) {
        userService.userRegister(name, password);
        return "Saved";
    }

//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<User> getAllUsers() {
//        return userRepository.findAll();
//    }
}
