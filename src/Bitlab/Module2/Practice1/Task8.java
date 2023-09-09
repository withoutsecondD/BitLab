package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[][] = new int[size][size];

        inputArray(arr);
        swapLines(arr);
        outputArray(arr);
    }

    static void swapLines(int array[][]) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            temp = array[0][i];
            array[0][i] = array[array.length - 1][i];
            array[array.length - 1][i] = temp;
        }
    }

    static void inputArray(int array[][]) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = in.nextInt();
            }
        }
    }

    static void outputArray(int array[][]) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }
}
