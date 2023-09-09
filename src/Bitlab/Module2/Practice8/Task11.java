package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(in.next());
        }

        System.out.println(set.size());
    }
}
