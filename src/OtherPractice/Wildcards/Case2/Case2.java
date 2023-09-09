package OtherPractice.Wildcards.Case2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Case2 {
    public static <T extends Number> T getFirst(List<T> list) {
        return list.get(0); // compile-time error
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Double> someList = new ArrayList<>(Arrays.asList(3.14, 4.133, 7.1));

        System.out.println(getFirst(someList));
    }
}
