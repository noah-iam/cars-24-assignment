package org.tech.car24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tech.car24.model.Bid;
import org.tech.car24.model.Car;
import org.tech.car24.service.AuctionService;
import org.tech.car24.service.CarService;

import java.util.List;

/**
 * @author Pratik Mishra
 * @created on 02-05-2020
 **/
@RestController
@RequestMapping("/api/")
public class AdminController {
    @Autowired
    private CarService carService;

    @Autowired
    private AuctionService auctionService;

    @GetMapping("admin/listAllCars")
    public List<Car> listAllCars() {
        return this.carService.listAllCars();
    }

    @GetMapping("admin/test")
    public String test() {
        return "Hello World from Admin";
    }

    @GetMapping("admin/getBidHistory")
    public List<Bid> getBidHistory(Car car) {
        return this.carService.getBidHistory(car);
    }

    @PostMapping("admin/updateAuctionState")
    public List<Bid> updateAuctionState(String newAuctionState) {
        return this.auctionService.updateAuctionState(newAuctionState);
    }

    @PostMapping("admin/restartSaleAuction")
    public Car restartSaleAuction(Car car) {
        return this.auctionService.restartSaleAuction(car);
    }
}
