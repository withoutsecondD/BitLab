package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = 1;
        double total = 1f;

        while (n != 0) {
            total *= n;
            n = in.nextDouble();
        }

        System.out.println((float)total);
    }
}
