package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int size = in.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();

            if (nums[i]%2 == 0) {
                count++;
            }
        }

        int evenArr[] = new int[count];
        int n = 0;

        for (int i = 0; i < count; i++) {
            for (int j = n; j < size; j++) {
                if(nums[j]%2 == 0) {
                    evenArr[i] = nums[j];
                    n = j + 1;
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(evenArr[i] + " ");
        }
    }
}
