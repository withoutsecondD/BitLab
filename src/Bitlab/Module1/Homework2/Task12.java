package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        }
        else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        }
        else if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c);
        }

    }
}
