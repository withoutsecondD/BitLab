package Bitlab.Module1.Practice2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n%2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
