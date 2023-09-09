package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
