package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;

        for (int i = n; i <= m; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
