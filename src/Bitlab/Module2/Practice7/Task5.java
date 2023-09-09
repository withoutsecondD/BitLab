package Bitlab.Module2.Practice7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            try {
                arr[i] = in.nextInt();
            }
            catch (Exception e) {
                in.next();
                arr[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

