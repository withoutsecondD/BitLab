package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        check(arr);
    }

    public static void check(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && array[i]%5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
