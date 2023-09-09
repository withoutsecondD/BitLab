package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        while (true) {
            int a = in.nextInt();

            if (a == 0) {
                break;
            }
            else {
                arr.add(a);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                arr.remove(i);
                i--;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println(max);
    }
}
