package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int total = 0;

        while (n != 0) {
            n = in.nextInt();

            if (n%2 != 0) {
                total += n;
            }
        }

        System.out.println(total);
    }
}
