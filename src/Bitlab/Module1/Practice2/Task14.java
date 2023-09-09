package Bitlab.Module1.Practice2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a%3 == 0 || a%5 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
