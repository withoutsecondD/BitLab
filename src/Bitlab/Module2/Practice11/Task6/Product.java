package Bitlab.Module2.Practice11.Task6;

import java.util.List;
import java.util.stream.Stream;

class Product {
    String name;
    String category;
    double price;

    public static Stream<Product> filterProducts(List<Product> products, int minPrice, int maxPrice, String category) {
        return products.stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice && p.category.equals(category));
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
