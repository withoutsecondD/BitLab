package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = Integer.MIN_VALUE;
        int n = 1;

        while (n != 0) {
            n = in.nextInt();
            if (n > a) {
                a = n;
            }
        }

        System.out.println(a);
    }
}
