package Bitlab.Module1.Practice5;

import java.util.Random;

public class AdditionalTask1 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Random random = new Random();
        int sum = 0;
        int column = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < 4; row++) {
            sum += arr[row][column];
            column++;
        }

        System.out.println(sum);
    }
}
