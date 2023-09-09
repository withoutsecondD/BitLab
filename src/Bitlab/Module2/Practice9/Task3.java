package Bitlab.Module2.Practice9;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        while (map.keySet().size() < 5) {
            map.put(in.next(), in.nextInt());
        }

        for (String key : map.keySet()) {
            System.out.println(key + " scored " + map.get(key) + " goals in EPL");
        }
    }
}
