package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
