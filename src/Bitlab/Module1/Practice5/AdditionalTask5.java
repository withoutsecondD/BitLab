package Bitlab.Module1.Practice5;

import java.util.Random;
import java.util.Scanner;

public class AdditionalTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int M = in.nextInt();
        int N = in.nextInt();
        double sum = 0;
        double average = 0;

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

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
        }

        average = sum / (M * N);

        System.out.println("\n" + "Среднее значение массива: " + average + "\n");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] > average) {
                    arr[i][j] = 1;
                }
                else if (arr[i][j] < average) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Конечный массив: ");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
