package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        int sum = 0;

        while (true) {
            String someString = in.next();

            if (someString.equals("stop")) {
                break;
            }
            else {
                set.add(someString);
            }
        }

        for (String s : set) {
            sum += s.length();
        }

        System.out.println(sum);
    }
}
