package ru.javamentor.preproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.javamentor.preproject.model.Car;
import ru.javamentor.preproject.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
    
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {
        List<String> msg = new ArrayList<>();
        msg.add("Hello!");
        msg.add("I'm Spring MVC application");
        msg.add("5.2.4 version by March 2020");
        modelMap.addAttribute("msg", msg);
        return "hello";
    }
}
