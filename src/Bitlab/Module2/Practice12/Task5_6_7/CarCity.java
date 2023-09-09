package Bitlab.Module2.Practice12.Task5_6_7;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car firstGreatVolumeCar() {
        return cars.stream().filter(v -> v.getEngineVolume() > 3).findFirst().orElse(null);
    }

    ArrayList<Car> search(String name) {
        return
                (ArrayList<Car>) cars.stream()
                        .filter(c -> c.getName().equals(name))
                        .collect(Collectors.toList());
    }

    ArrayList<Car> filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume) {
        return
                (ArrayList<Car>) cars.stream()
                        .filter(c -> (c.getMaxSpeed() >= fromSpeed && c.getMaxSpeed() <= toSpeed) && (c.getEngineVolume() >= fromVolume && c.getEngineVolume() <= toVolume))
                        .collect(Collectors.toList());
    }

    public CarCity() {
    }

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
