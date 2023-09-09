package Bitlab.Module1.Practice5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = {
                {12, 5, 7, 6},
                {4, 0, 2, 7},
                {9, 1, 3, 2},
                {10, -2, 4, 6},
        };

        int M = in.nextInt();
        int N = in.nextInt();

        System.out.println(arr[M][N]);
    }
}
