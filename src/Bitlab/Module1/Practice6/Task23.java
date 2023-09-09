package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.nextLine();
        int count = 0;

        for (int i = 0; i < someWord.length(); i++) {
            if ((someWord.charAt(i) > 64 && someWord.charAt(i) < 91) || (someWord.charAt(i) > 96 && someWord.charAt(i) < 123)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
