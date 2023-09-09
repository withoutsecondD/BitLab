package Bitlab.Module1.Practice5;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int row = 0;
        int column = 0;
        int max = Integer.MIN_VALUE;

        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
