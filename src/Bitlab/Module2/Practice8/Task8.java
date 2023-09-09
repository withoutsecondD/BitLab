package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int a = in.nextInt();

            if (a == 0) {
                break;
            }
            else {
                arr.add(a);
            }
        }

        for (Integer i : arr) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                }
            }

            if (i == 1) {
                isPrime = false;
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
