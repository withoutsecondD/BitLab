package Bitlab.Module2.Practice5;

public class Task1_2_3_4 {
}

abstract class Food {
    String name;
    abstract double getCalories();

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Chocolate extends Food {
    int weight;

    double getCalories() {
        return (weight * 740);
    }

    public Chocolate() {
    }

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Burger extends Food {
    int meatAmount;
    int meatType;

    double getCalories() {
        if (meatType == 1) {
            return (meatAmount * 840);
        }
        else if (meatType == 2) {
            return (meatAmount * 560);
        }
        else {
            return 0;
        }
    }

    public Burger() {
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }
}

class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    double getCalories() {
        if (isSparkling) {
            return (volumeLiters * 400);
        }
        else {
            return (volumeLiters * 100);
        }
    }

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean getIsSparkling() {
        return isSparkling;
    }

    public void setIsSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }
}
