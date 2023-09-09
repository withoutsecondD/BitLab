package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        char arr[] = new char[someWord.length()];

        for (int i = 0; i < someWord.length(); i++) {
            arr[i] = someWord.charAt(i);
        }

        for (int i = 0; i < someWord.length(); i++) {
            if (arr[i] == 'a') {
                arr[i] = 'o';
            }
        }

        for (int i = 0; i < someWord.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
