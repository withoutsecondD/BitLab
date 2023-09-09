package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int nums[] = new int[size];
        int sum = 0;
        boolean secondZero = false;

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {

                secondZero = true;
                for (int j = i + 1; j < size; j++) {
                    if (nums[j] != 0) {
                        sum += nums[j];
                    }
                    else {
                        break;
                    }
                }
            }

            if (secondZero) {
                break;
            }
        }

        System.out.println(sum);
    }
}
