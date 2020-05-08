package org.tech.car24.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tech.car24.model.Bid;
import org.tech.car24.model.Car;
import org.tech.car24.model.User;
import org.tech.car24.repository.CarRepository;

import java.util.List;

/**
 * @author Pratik Mishra
 * @created on 02-05-2020
 **/
@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> getCars(String carName) {
        return carRepository.findAllByName(carName);
    }

    public List<Car> listAllCars(User user) {
        return null;
    }

    public List<Bid> getBidHistory(Car car, User user) {
        return null;
    }

    public List<Car> getCarsToPurchase() {
        return null;
    }

    public Car bidCar(Car car) {
        return null;
    }

    public Car getAuctionState(Car car) {
        return null;
    }

    public Car getSalePrice(Car car) {
        return null;
    }

    public Car uploadCarPicture(Car car) {
        return null;
    }

    public Car approveSalePrice(Car car) {
        return null;
    }

    public Car addCarForSale(Car car) {
        return null;
    }

    public List<Car> listAllCars() {
        return null;
    }

    public List<Bid> getBidHistory(Car car) {
        return null;
    }
}
