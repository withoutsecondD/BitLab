package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int total = 1;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != 0 && i%2 == 0) {
                total *= nums[i];
            }
        }

        System.out.println(total);
    }
}
