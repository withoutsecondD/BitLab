package Bitlab.Module1.Practice5;

import java.util.Random;
import java.util.Scanner;

public class AdditionalTask7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;

        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        System.out.println("\n" + "Изначальный массив: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n" + "Ответ: ");

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                if (arr[i][j]%3 == 0) {
                    sum += arr[i][j];
                }
            }

            System.out.print(sum + " ");
            sum = 0;
        }
    }
}
