package Bitlab.Module2.Practice12.AdditionalTask1;

import java.util.Arrays;
import java.util.List;

public class AdditionalTask2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banan", "orange");

        int maxLength = list1.stream()
                .mapToInt(String::length)
                .max().getAsInt();

        System.out.println(maxLength);
    }
}
