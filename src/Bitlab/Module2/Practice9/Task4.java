package Bitlab.Module2.Practice9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someStr = in.nextLine();
        String[] someStrAsArr = someStr.split(" ");
        HashSet<String> set = new HashSet<>();

        for (String s : someStrAsArr) {
            set.add(s);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String i : set) {
            int count = 0;

            for (String j : someStrAsArr) {
                if (i.equals(j)) {
                    count++;
                }
            }

            map.put(i, count);
        }

        for (String key : map.keySet()) {
            System.out.println("'" + key + "' occurs " + map.get(key) + " times");
        }
    }
}
