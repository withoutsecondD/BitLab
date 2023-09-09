package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int nums[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();

            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }
        }

        int container;
        container = nums[indexMin];
        nums[indexMin] = nums[indexMax];
        nums[indexMax] = container;

        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
