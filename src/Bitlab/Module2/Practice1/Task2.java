package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println(triangle(x, y, z));
    }

    static String triangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
