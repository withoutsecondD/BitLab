package Bitlab.Module1.Practice2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a%17 == 0) {
            System.out.println("DIVISIBLE BY 17");
        }
    }
}
