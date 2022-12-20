package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    @GetMapping(value = "cars")
    public String printCars(@RequestParam(name = "count",defaultValue = "5")int count, Model model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("carList",carService.showCars(Car.getCarList(),count));
        return "cars";
    }
}
