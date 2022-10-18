package com.sankalp.app.controller;

import com.sankalp.app.model.Users;
import com.sankalp.app.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Users> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Users users) {
        usersRepository.save(users);
        return "saved";
    }
}
