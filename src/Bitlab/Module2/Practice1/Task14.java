package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println(check(arr));
    }

    public static int check(int array[]) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }

        return count;
    }
}
