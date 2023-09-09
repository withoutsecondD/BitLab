package Bitlab.Module2.Practice6;

public class Task9_10_11_12 {
}

interface Animal {
    String getSound();
}

class Dog implements Animal {
    private String name;
    private String breed;

    public String getSound() {
        return "Woof!";
    }

    public Dog() {
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Cat implements Animal {
    private String name;
    private int age;

    boolean isKitten() {
        if (age < 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getSound() {
        return "Meow!";
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cow implements Animal {
    private String name;
    private double weight;
    private int age;

    boolean isOld () {
        if (age > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getSound() {
        return "Moo!";
    }

    public Cow() {
    }

    public Cow(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}