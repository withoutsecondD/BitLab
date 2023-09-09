package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        outputOdd(arr);
    }

    public static void outputOdd(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 23) {
                break;
            }
            else if (array[i]%2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
