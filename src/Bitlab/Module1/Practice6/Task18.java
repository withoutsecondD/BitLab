package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        char someWordChar[] = new char[someWord.length()];

        for (int i = 0; i < someWord.length(); i++) {
            someWordChar[i] = someWord.charAt(someWord.length() - (1 + i));
        }

        String someWordReversed = new String(someWordChar);

        if (someWord.equals(someWordReversed)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
