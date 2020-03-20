package ru.javamentor.preproject.service;

import org.springframework.stereotype.Service;
import ru.javamentor.preproject.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    
    public List<Car> getAllCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "A8"));
        cars.add(new Car(2, "BMW", "X5"));
        return cars;
    }
}