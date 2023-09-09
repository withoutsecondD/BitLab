package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a != b && a != c) {
            System.out.println("1");
        }

        if (b != a && b != c) {
            System.out.println("2");
        }

        if (c != a && c != b) {
            System.out.println("3");
        }

        if (d != a && d != b) {
            System.out.println("4");
        }

    }
}
