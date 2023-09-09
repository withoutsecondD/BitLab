package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        for (Integer i : arr) {
            if (i > firstMax) {
                firstMax = i;
            }
        }

        for (Integer i : arr) {
            if (i > secondMax && i != firstMax) {
                secondMax = i;
            }
        }

        System.out.println(secondMax);
    }
}
