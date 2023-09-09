package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int countMin = 0;
        int countMax = 0;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();

            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] != max && nums[i] != min) {
                sum += nums[i];
            }
            else if (nums[i] == min) {
                if (countMin == 0) {
                    countMin++;
                }
                else {
                    sum += nums[i];
                }
            }
            else if (nums[i] == max) {
                if (countMax == 0) {
                    countMax++;
                }
                else {
                    sum += nums[i];
                }
            }
        }


        System.out.println(sum);
        System.out.println((float)(sum) / (size - 2));
    }
}
