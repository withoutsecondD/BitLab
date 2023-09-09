package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int max = Integer.MIN_VALUE;
        int index = 0;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        System.out.println(max + " " + index);
    }
}
