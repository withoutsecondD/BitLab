package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (b != 7) {
            System.out.println("NO");
        }
        else if (c != 0 && c != 7) {
            System.out.println("NO");
        }
        else if (d != 0 && d != 1 && d != 5 && d != 7) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
