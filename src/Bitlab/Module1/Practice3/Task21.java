package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int sum = 0;

        while (n != 0) {
            n = in.nextInt();
            sum += n;
        }

        System.out.println(sum);
    }
}
