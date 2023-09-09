package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        int sum = 0;

        for (int i = 0; i < someWord.length(); i++) {
            if (someWord.charAt(i) > 47 && someWord.charAt(i) < 58) {
                sum += Integer.parseInt(String.valueOf(someWord.charAt(i)));
            }
        }

        System.out.println(sum);
    }
}
