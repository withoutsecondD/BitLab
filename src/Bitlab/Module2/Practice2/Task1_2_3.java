package Bitlab.Module2.Practice2;


public class Task1_2_3 {
    public class Phone{
        String name;
        String model;
        int price;

        public Phone() {
            this.name = "No Name";
            this.model = "No Info";
            this.price = 0;
        }

        public Phone(String name, String model, int price) {
            this.name = name;
            this.model = model;
            this.price = price;
        }

        String getData(String name, String model, int price) {
            return (name + " - " + model + " for " + price + " KZT");
        }
    }

    public static void main(String[] args) {

    }
}
