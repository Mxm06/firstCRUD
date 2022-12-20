package web.Model;

import java.util.ArrayList;
import java.util.List;

public class Car {
   private String model;
    private String color;
    private int series;

    public Car(String model,String color,int series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    public static List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Honda","Black",150));
        carList.add(new Car("Toyota","White",160));
        carList.add(new Car("BMW","Blue",170));
        carList.add(new Car("Subaru","Red",180));
        carList.add(new Car("Cadillac","Grey",190));
        return carList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
