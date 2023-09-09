package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i * i;
        }

        System.out.println(total);
    }
}
