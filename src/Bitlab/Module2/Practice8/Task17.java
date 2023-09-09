package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                break;
            }
            else {
                arr.add(num);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (Integer i : arr) {
            set.add(i);
        }

        arr.clear();

        for (Integer i : set) {
            arr.add(i);
        }

        System.out.println(arr);
    }
}
