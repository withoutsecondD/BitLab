package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float sum = 0;
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        for (Integer i : arr) {
            sum += i;
        }

        System.out.println(sum / n);
    }
}
