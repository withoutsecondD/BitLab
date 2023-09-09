package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.print((arr.get(i) / 2) + " ");
        }
    }
}
