package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = 3;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += k;
            k += 3;
        }

        System.out.println(sum);
    }
}
