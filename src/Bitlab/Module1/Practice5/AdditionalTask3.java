package Bitlab.Module1.Practice5;

public class AdditionalTask3 {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1},
        };

        int n = magicSquare.length;
        int magicConstant = n * (n * n + 1) / 2;

        boolean isMagicSquare = true;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += magicSquare[i][j];
            }

            if (sum != n) {
                isMagicSquare = false;
            }

            sum = 0;
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                sum += magicSquare[i][j];
            }

            if (sum != n) {
                isMagicSquare = false;
            }

            sum = 0;
        }

        int column = 0;

        for (int row = 0; row < 4; row++) {
            sum += magicSquare[row][column];
            column++;
        }

        if (sum != n) {
            isMagicSquare = false;
        }

        if (isMagicSquare) {
            System.out.println("Заданный двумерный массив является магическим квадратом");
        }
        else {
            System.out.println("Заданный двумерный массив НЕ является магическим квадратом");
        }
    }
}
