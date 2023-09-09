package Bitlab.Module2.Practice4;

public class Task7_8_9_10 {
}

class Sportsman {
    String fullName;
    int age;
    String country;

    String play() {
        return ("Sportsman " + fullName + " from " + country + " " + age + " years old is playing");
    }

    public Sportsman() {
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }
}

class Gymnast extends Sportsman {
    int height;
    int weight;
    String style;

    public Gymnast() {
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    String play() {
        return ("Gymnast " + fullName + " from " + country + " " + age + " years old, " + weight + " kg, " + height + " cm, with " + style + " style is jumping.");
    }
}

class Footballer extends Sportsman {
    String position;
    String club;

    public Footballer() {
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    String play() {
        return ("Footballer " + fullName + " from " + country + ", " + age + " years old " + position + " is playing for " + club);
    }
}

class Swimmer extends Sportsman {
    String style;
    double recordTime;

    public Swimmer() {
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    String play() {
        return ("Swimmer " + fullName + " from " + country + ", " + age + " years old with " + style + " style swimmed in " + recordTime + " seconds");
    }
}