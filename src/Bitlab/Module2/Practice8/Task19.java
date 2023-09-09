package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                break;
            }
            else {
                set.add(num);
            }
        }

        int numToCheck = in.nextInt();

        if (set.contains(numToCheck)) {
            System.out.println("Number " + numToCheck + " included in the set.");
        }
        else {
            System.out.println("Number " + numToCheck + " not included in the set.");
        }
    }
}
