package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        check(someWord);
    }

    public static void check(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
