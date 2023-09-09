package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int sum = 0;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }

        System.out.println(sum + " " + ((double)(sum) / size));
    }
}
