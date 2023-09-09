package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        for (int i = 0; i < someWord.length(); i++) {
            System.out.println(someWord.charAt(i));
        }
    }
}
