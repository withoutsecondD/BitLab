package Bitlab.Module1.Practice2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a != b) {
            System.out.println(a + b);
        }
        else {
            System.out.println("0");
        }
    }
}
