package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "cars")
    public String printCars(@RequestParam(name = "count",defaultValue = "5")int count, Model model) {
        model.addAttribute("carList",carService.showCars(Car.getCarList(),count));
        return "cars";
    }
}
