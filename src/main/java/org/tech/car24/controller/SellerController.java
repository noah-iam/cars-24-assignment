package org.tech.car24.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.car24.model.Car;
import org.tech.car24.model.User;
import org.tech.car24.service.CarService;

import java.util.List;

/**
 * @author Pratik Mishra
 * @created on 02-05-2020
 **/
@RestController
@RequestMapping("/api")
public class SellerController {
    @Autowired
    private CarService carService;

    @GetMapping("seller/test")
    public String test() {
        return "Hello World from Seller!";
    }

    @GetMapping("seller/listAllCars")
    public List<Car> listAllCarsByUser(User user) {
        return this.carService.listAllCars(user);
    }

    @GetMapping("seller/getAuctionState")
    public Car getAuctionState(Car car) {
        return this.carService.getAuctionState(car);
    }

    @GetMapping("seller/getSalePrice")
    public Car getSalePrice(Car car) {
        return this.carService.getSalePrice(car);
    }

    @PostMapping("seller/uploadCarPicture")
    public Car uploadCarPicture(Car car) {
        return this.carService.uploadCarPicture(car);
    }

    @PostMapping("seller/approveSalePrice")
    public Car approveSalePrice(Car car) {
        return this.carService.approveSalePrice(car);
    }

    @PostMapping("seller/addCarForSale")
    public Car addCarForSale(Car car) {
        return this.carService.addCarForSale(car);
    }
}
