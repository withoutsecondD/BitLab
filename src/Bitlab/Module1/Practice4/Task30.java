package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int nums[] = new int[size];
        boolean sameSign = false;

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] * nums[i + 1] > 0)  {
                sameSign = true;
                break;
            }
        }

        if (sameSign) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
