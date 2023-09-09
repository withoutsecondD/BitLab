package Bitlab.Module2.Practice10.Task4;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    List<T> contents = new ArrayList<>();

    void add(T item) {
        contents.add(item);
    }

    List<T> getContents() {
        return contents;
    }
}
