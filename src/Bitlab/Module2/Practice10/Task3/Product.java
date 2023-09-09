package Bitlab.Module2.Practice10.Task3;

public class Product <T> {
    String name;
    float price;
    T category;

    String getData() {
        return ("Product: " + name + ", Price: " + price + ", Category: " + category);
    }

    public Product() {
    }

    public Product(String name, float price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
