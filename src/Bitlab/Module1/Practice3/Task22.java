package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int sum = 0;
        int count = 0;

        while (n != 0) {
            n = in.nextInt();
            sum += n;
            count++;
        }

        System.out.println(sum / (count - 1));
    }
}
