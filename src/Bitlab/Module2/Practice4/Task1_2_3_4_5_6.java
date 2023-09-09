package Bitlab.Module2.Practice4;

public class Task1_2_3_4_5_6 {
}

class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    String ride() {
        return ("Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters is riding.");
    }

    public Car() {
        name = null;
        model = null;
        maxSpeed = 0;
        year = 0;
        volume = 0;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }
}

class Toyota extends Car {
    String manufacturer;

    public Toyota() {
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    @Override
    String ride() {
        return (name + " Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters manufactured from " + manufacturer + " is riding.");
    }
}

class Mercedes extends Car {
    String classType;

    @Override
    String ride() {
        return (name + " Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters with " + classType + " class is riding.");
    }

    public Mercedes() {
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }
}