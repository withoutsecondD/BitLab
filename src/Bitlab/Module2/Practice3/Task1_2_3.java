package Bitlab.Module2.Practice3;

public class Task1_2_3 {
}

class Phone {
    private String name;
    private String model;
    private int price;

    String getCategory() {
        if (price > 1000) {
            return "TOP";
        }
        else if (price <= 1000 && price >= 500) {
            return "MEDIUM";
        }
        else {
            return "SIMPLE";
        }
    }

    Phone() {
        name = null;
        model = null;
        price = 0;
    }

    Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}