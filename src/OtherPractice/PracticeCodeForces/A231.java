package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tasks = in.nextInt();
        int countOfTasks = 0;
        int knowsSolution = 0;

        int arr[][] = new int[tasks][3];

        for (int i = 0; i < tasks; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < tasks; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 1) {
                    knowsSolution++;
                }
            }

            if (knowsSolution > 1) {
                countOfTasks++;
            }
            knowsSolution = 0;
        }

        System.out.println(countOfTasks);

    }
}
