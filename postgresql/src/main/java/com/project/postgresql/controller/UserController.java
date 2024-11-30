package com.project.postgresql.controller;

import com.project.postgresql.exception.UserNotFoundException;
import com.project.postgresql.model.Users;
import com.project.postgresql.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> listUser(Model model) {
        List<Users> users = userService.getAllUser();
        return users;
    }

    @PostMapping("/addUser")
    public String addNewUser(@RequestBody Users user) {
        userService.addUser(user);
        return "users successfully added";
    }

    @GetMapping("/getUser/{name}")
    public Users getUserByName(@PathVariable("name") String name){
        System.out.println(name);
        Optional<Users> user =  userService.getUserByUserName(name);
        return user.orElseThrow(() -> new UserNotFoundException("User not found with name: " + name));
    }
}
