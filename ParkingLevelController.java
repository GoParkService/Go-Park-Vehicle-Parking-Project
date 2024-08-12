package com.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.beans.ParkingLevel;
import com.demo.service.ParkingLevelService;

import java.util.List;

@RestController
@RequestMapping("/api/parking-levels")
public class ParkingLevelController {

    @Autowired
    private ParkingLevelService parkingLevelService;

    @PostMapping
    public ParkingLevel createParkingLevel(@RequestBody ParkingLevel parkingLevel) {
        return parkingLevelService.saveParkingLevel(parkingLevel);
    }

    @GetMapping
    public List<ParkingLevel> getAllParkingLevels() {
        return parkingLevelService.getAllParkingLevels();
    }

    @GetMapping("/{id}")
    public ParkingLevel getParkingLevelById(@PathVariable int id) {
        return parkingLevelService.getParkingLevelById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingLevel(@PathVariable int id) {
        parkingLevelService.deleteParkingLevelById(id);
    }
}

