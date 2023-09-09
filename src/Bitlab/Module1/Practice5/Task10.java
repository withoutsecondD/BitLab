package Bitlab.Module1.Practice5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i%2 == 0 && j%2 == 0) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
