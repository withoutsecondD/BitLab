package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (c - a == d - b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
