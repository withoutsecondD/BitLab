package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
