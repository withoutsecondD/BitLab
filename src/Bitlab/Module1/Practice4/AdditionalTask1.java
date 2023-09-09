package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;

        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Введите число для нахождения пар: ");
        int k = in.nextInt();

        System.out.println("Найдены следующие пары чисел, сумма которых равна " + k + ":");
        for (int i = start; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + k);
                }
            }
            start++;
        }
    }
}
