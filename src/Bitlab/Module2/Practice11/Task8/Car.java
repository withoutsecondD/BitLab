package Bitlab.Module2.Practice11.Task8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Car {
    String brand;
    String model;
    int year;

    static Stream<Car> getCarsAfterYear(ArrayList<Car> cars, int year) {
        return cars.stream()
                .filter(c -> c.getYear() > year);
    }

    public Car() {
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
