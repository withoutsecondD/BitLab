package Bitlab.Module1.Practice5;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int rowMax = 0;
        int columnMax = 0;
        int rowMin = 0;
        int columnMin = 0;

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
                    rowMax = i;
                    columnMax = j;
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                    rowMin = i;
                    columnMin = j;
                }
            }
        }

        int container = 0;
        container = arr[rowMax][columnMax];
        arr[rowMax][columnMax] = arr[rowMin][columnMin];
        arr[rowMin][columnMin] = container;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
