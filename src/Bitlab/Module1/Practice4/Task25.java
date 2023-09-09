package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int count = 0;
        int sum = 0;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        int m = in.nextInt();

        for (int i = 0; i < size; i++) {
            if (nums[i] > m) {
                count++;
                sum += nums[i];
            }
        }

        System.out.println((float)sum / count);
    }
}
