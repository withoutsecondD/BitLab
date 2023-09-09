package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = a;
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println(max-min);
    }
}
