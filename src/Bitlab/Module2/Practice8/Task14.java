package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task14 {
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

        if (set.contains(77)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
