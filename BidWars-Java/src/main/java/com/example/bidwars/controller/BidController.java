package com.example.bidwars.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/car")
public class BidController {

    @GetMapping()
    public String randomCar(){
        String[] cars = {"E36", "R34", "RX-7"};

        Random random = new Random();
        int randomIndex = random.nextInt(cars.length);

        return cars[randomIndex];
    }
}
