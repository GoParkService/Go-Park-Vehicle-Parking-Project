package com.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.beans.ParkingUser;
import com.demo.service.ParkingUserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ParkingUserController {

    @Autowired
    private ParkingUserService parkingUserService;

    @GetMapping
    public List<ParkingUser> getAllUsers() {
        return parkingUserService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ParkingUser getUserById(@PathVariable int id) {
        return parkingUserService.getUserById(id);
    }

    @PostMapping
    public ParkingUser saveUser(@RequestBody ParkingUser user) {
        return parkingUserService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        parkingUserService.deleteUserById(id);
    }
}
