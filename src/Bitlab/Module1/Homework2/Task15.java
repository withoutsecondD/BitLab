package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((b > a && c > b) || (b < a && c < b)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
