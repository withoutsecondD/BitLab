package Bitlab.Module2.Practice5;

public class Task5_6_7 {
}

abstract class GoldShape {
    abstract double getVolume();
    double getPrice() {
        return (getVolume() * 250 + 1200);
    }

    public GoldShape() {
    }
}

class SphereGold extends GoldShape {
    double radius;

    double getVolume() {
        return (4 / 3 * 3.14 * radius * radius * radius);
    }

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class CubeGold extends GoldShape {
    double side;

    double getVolume() {
        return (side * side * side);
    }

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
