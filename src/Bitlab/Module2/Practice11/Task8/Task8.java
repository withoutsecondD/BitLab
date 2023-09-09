package Bitlab.Module2.Practice11.Task8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Porsche", "911", 1999));
        cars.add(new Car("Mercedes", "B", 1989));
        cars.add(new Car("Toyota", "Camry", 2001));
        cars.add(new Car("Toyota", "Land Cruiser", 2000));

        Stream<Car> filteredCars = Car.getCarsAfterYear(cars, 1990);

        filteredCars.forEach(c -> System.out.println(c.brand + " " + c.model + " " + c.getYear()));
    }
}
