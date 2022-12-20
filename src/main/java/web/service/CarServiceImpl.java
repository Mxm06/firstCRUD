package web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> showCars(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
