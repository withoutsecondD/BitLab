package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
