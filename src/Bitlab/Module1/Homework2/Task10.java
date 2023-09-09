package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = a;
        int max = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        int sum = (min / 10 + min%10) + (max / 10 + max%10);

        System.out.println(sum);
    }
}
