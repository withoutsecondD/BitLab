package Bitlab.Module2.Practice9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someStr = in.nextLine();
        char[] charArr = someStr.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (Character c : charArr) {
            set.add(c);
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character i : set) {
            int count = 0;

            for (Character j : charArr) {
                if (i == j) {
                    count++;
                }
            }

            map.put(i, count);
        }

        for (Character key : map.keySet()) {
            System.out.println("'" + key + "' occurs " + map.get(key) + " times");
        }
    }
}
