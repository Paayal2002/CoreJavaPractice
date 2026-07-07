package com.example.RedBus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/java")
    public String DNR() {
        return "Highest cost premium Travellers";
    }

    @PostMapping("/Purple")
    public String FirstApi() {
        return "Provide comfortable travellers";
    }

    @PutMapping("/IntrCity")
    public String SecondApi() {
        return "Premium Quality Bus";
    }

    @DeleteMapping("/DolphinTravelhouse")
    public String ThirdApi() {
        return "Affordable for all";
    }

    @PostMapping("/ZingBus")
    public String FourthApi() {
        return "Provide Other Services like lunch";
    }
}