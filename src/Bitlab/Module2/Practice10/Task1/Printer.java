package Bitlab.Module2.Practice10.Task1;

public class Printer <T> {
    T obj;

    void setValue (T value) {
        obj = value;
    }

    T getValue() {
        return obj;
    }

    void printValue() {
        System.out.println("Value is " + obj);
    }

    void refresh() {
        obj = null;
    }
}
