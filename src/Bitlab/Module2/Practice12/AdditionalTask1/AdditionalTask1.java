package Bitlab.Module2.Practice12.AdditionalTask1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AdditionalTask1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "grape", "kiwi");

        HashSet<String> uniqueElements = new HashSet<>();

        uniqueElements.addAll(list1.stream().toList());
        uniqueElements.addAll(list2.stream().toList());

        for (String s : uniqueElements)
            System.out.println(s);
    }
}
