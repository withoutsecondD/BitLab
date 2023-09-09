package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task15 {
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
        boolean isUnique = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != i) {
                    if (array[i] == array[j]) {
                        isUnique = false;
                    }
                }
            }

            if (isUnique) {
                System.out.print(array[i] + " ");
            }

            isUnique = true;
        }
    }
}
