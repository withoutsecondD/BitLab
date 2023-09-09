package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int sum = 0;
        double average;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }

        average = (float)(sum) / size;

        for (int i = 0; i < size; i++) {
            if (nums[i] > average) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
