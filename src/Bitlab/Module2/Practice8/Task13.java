package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                break;
            }
            else {
                set.add(num);
            }
        }

        for (Integer i : set) {
            sum += i;
        }

        System.out.println(sum);
    }
}
