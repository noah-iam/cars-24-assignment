package org.tech.car24.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.car24.service.CarService;
import org.tech.car24.model.Bid;
import org.tech.car24.model.Car;
import org.tech.car24.model.User;

import java.util.List;

/**
 * @author Pratik Mishra
 * @created on 02-05-2020
 **/
@RestController
@RequestMapping("/api")
public class BuyerController {
    @Autowired
    private CarService carService;

    @GetMapping("buyer/test")
    public String test() {
        return "Hello World from Buyer!";
    }

    @GetMapping("buyer/getCarsToPurchase")
    public List<Car> getCarsToPurchase() {
        return this.carService.getCarsToPurchase();
    }

    @PostMapping("buyer/bidCar")
    public Car bidCar(Car car) {
        return this.carService.bidCar(car);
    }

    @GetMapping("buyer/getBidHistory")
    public List<Bid> getBidHistory(Car car, User user) {
        return this.carService.getBidHistory(car, user);
    }
}
