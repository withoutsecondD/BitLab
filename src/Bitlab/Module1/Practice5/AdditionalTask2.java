package Bitlab.Module1.Practice5;

public class AdditionalTask2 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        int value = 1;

        for (int i = 0; i < 10; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = value;
                    value++;
                }
            }
            else {
                for (int j = 9; j >= 0; j--) {
                    arr[i][j] = value;
                    value++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
