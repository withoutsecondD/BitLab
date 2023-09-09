package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        String someLetter = in.next();
        int count = 0;

        for (int i = 0; i < someWord.length(); i++) {
            if (String.valueOf(someWord.charAt(i)).equalsIgnoreCase(someLetter)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
