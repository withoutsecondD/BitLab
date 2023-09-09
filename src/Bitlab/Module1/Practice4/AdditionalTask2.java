package Bitlab.Module1.Practice4;

import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        int action = 0;



        while (action != 8) {
            System.out.println("Выберите действие:");
            System.out.println("    1. Вывести на экран все элементы массива");
            System.out.println("    2. Найти сумму всех элементов массива и вывести её");
            System.out.println("    3. Найти среднее арифметическое всех элементов массива и вывести его");
            System.out.println("    4. Найти наименьший элемент массива и вывести его");
            System.out.println("    5. Найти наименьший элемент массива и вывести его");
            System.out.println("    6. Отсортировать массив по возрастанию и вывести его значения на экран");
            System.out.println("    7. Отсортировать массив по убыванию и вывести его значения на экран");
            System.out.println("    8. Выход из программы");

            action = in.nextInt();

            switch (action) {
                case 1:
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    System.out.println(sum);
                    System.out.println("\n");
                    break;

                case 3:
                    sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    System.out.println((float) (sum) / arr.length);
                    System.out.println("\n");
                    break;

                case 4:
                    int min = Integer.MAX_VALUE;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }
                    System.out.println(min);
                    System.out.println("\n");
                    break;

                case 5:
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println(max);
                    System.out.println("\n");
                    break;

                case 6:
                    int container = 0;
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] > arr[j]) {
                                container = arr[i];
                                arr[i] = arr[j];
                                arr[j] = container;
                            }
                        }
                    }

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n");
                    break;

                case 7:
                    container = 0;
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                            if (arr[i] < arr[j]) {
                                container = arr[i];
                                arr[i] = arr[j];
                                arr[j] = container;
                            }
                        }
                    }

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n");
                    break;

                case 8:
                    break;
            }
        }
    }
}
