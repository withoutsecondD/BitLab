package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(getMax(a, b, c));
    }

    static int getMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        else if (b >= a && b >= c) {
            return b;
        }
        else if (c >= a && c >= b) {
            return c;
        }

        return Integer.MIN_VALUE;
    }
}
