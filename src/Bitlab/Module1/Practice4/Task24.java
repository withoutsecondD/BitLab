package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int count = 0;
        int index = 0;

        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }

        int m = in.nextInt();

        for (int i = 0; i < size; i++) {
            if (nums[i] == m) {
                count++;
                index = i;
            }
        }

        if (count != 0) {
            System.out.println("YES");
            System.out.println(index);
        }
        else {
            System.out.println("NO");
        }
    }
}
