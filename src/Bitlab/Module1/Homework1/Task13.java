package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int tens = number / 10;
        int last = number % 10;

        System.out.println(last * 10 + tens);
    }
}
