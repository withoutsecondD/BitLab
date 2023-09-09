package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[][] = new int[5][5];
        int row = 0;
        int column = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    row = i + 1;
                    column = j + 1;
                    break;
                }
                if (row != 0) {
                    break;
                }
            }
        }

        System.out.println(Math.abs(row - 3) + Math.abs(column - 3));
    }
}
