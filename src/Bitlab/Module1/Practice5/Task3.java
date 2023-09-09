package Bitlab.Module1.Practice5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();

        for (int j = 0; j < N; j++) {
            System.out.print(arr[K][j] + " ");
        }
    }
}
