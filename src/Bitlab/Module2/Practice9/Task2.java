package Bitlab.Module2.Practice9;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            map.put(in.next(), in.nextInt());
        }

        System.out.println(map.keySet().size());
    }
}
