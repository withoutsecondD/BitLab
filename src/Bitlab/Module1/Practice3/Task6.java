package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
