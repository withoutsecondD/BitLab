package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (b > a) {
            System.out.println("1");
        }
        else {
            System.out.println("2");
        }
    }
}
