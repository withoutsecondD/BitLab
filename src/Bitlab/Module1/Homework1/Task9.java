package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int a1 = a * 2;
        int b1 = b - 3;
        int c1 = c * c;

        int sum = a1 + b1 + c1;

        System.out.println(sum);
    }
}
