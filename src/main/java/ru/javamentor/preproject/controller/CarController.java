package ru.javamentor.preproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.javamentor.preproject.model.Car;
import ru.javamentor.preproject.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;
    
    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
    
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String allCarWithHeader(ModelMap modelMap,
            @RequestParam(value = "locale", defaultValue = "en") String locale) {
        List<Car> cars = carService.getAllCar();
        String loc = (locale.equals("en")) ? "CARS" : "МАШИНЫ";
        modelMap.addAttribute("locale", loc);
        modelMap.addAttribute("carsList", cars);
        System.out.println(cars.size());
        return "cars";
    }
}
