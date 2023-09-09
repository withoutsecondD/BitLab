package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = in.nextDouble();
        double total = 0;

        for (double i = 1; i <= n; i++) {
            total += 1 / i;
        }

        System.out.println(total);
    }
}
