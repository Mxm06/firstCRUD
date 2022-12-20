package web.service;

import web.Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> showCars(List<Car> carList, int count);
}
