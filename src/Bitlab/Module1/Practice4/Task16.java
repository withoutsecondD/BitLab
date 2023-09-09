package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        int k = in.nextInt();

        for (int i = 0; i < size; i++) {
            if (nums[i]%k == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
