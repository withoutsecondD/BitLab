package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        char arr[] = new char[someWord.length()];

        for (int i = 0; i < someWord.length(); i++) {
            arr[i] = someWord.charAt(i);
        }

        for (int i = someWord.length() - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
