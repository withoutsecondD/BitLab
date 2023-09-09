package Bitlab.Module1.Practice5;

import java.util.Random;
import java.util.Scanner;

public class AdditionalTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int M = in.nextInt();
        int N = in.nextInt();
        int max = Integer.MIN_VALUE;
        int columnMax = 0;
        int sum = 0;

        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    columnMax = j;
                }
            }

            for (int j = 0; j < N; j++) {
                if (j != columnMax) {
                    sum += arr[i][j];
                }
            }

            arr[i][columnMax] = sum;
            sum = 0;
            max = Integer.MIN_VALUE;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
