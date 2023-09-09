package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        while (true) {
            String str1 = in.next();

            if (str1.equals("exit")) {
                break;
            }
            else {
                set1.add(str1);
            }
        }

        while (true) {
            String str2 = in.next();

            if (str2.equals("exit")) {
                break;
            }
            else {
                set2.add(str2);
            }
        }

        set1.addAll(set2);

        System.out.println(set1);
    }
}
