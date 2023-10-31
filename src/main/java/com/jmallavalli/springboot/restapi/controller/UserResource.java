package com.jmallavalli.springboot.restapi.controller;

import com.jmallavalli.springboot.restapi.exceptions.UserNotFoundException;
import com.jmallavalli.springboot.restapi.model.User;
import com.jmallavalli.springboot.restapi.service.UserDaoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    private final UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User match = userDaoService.find(id);
        if(match == null) {
            throw new UserNotFoundException("id: " + id);
        }
        return match;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User newUser) {
        userDaoService.saveUser(newUser);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userDaoService.delete(id);
    }
}
