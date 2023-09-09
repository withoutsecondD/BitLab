package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            set.add(in.nextInt());
        }

        for (Integer i : set) {
            sum += i;
        }

        System.out.println(sum);
    }
}
