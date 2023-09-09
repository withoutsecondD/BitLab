package Bitlab.Module1.Practice5;

import java.util.Random;
import java.util.Scanner;

public class AdditionalTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n" + "Введите размеры двумерного массива: ");

        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        boolean isPrime = true;

        int arr[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = random.nextInt(17);
            }
        }

        System.out.println("\n" + "Изначальный массив: ");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] != 1) {
                    for (int k = 2; k < arr[i][j]; k++) {
                        if (arr[i][j]%k == 0) {
                            isPrime = false;
                        }
                    }

                    if (isPrime) {
                        sum += arr[i][j];
                    }

                    isPrime = true;
                }
            }
        }

        System.out.println("\n" + "Сумма всех простых чисел массива: " + sum);
    }
}
