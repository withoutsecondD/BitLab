package Bitlab.Module2.Practice8;

import java.util.HashSet;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = 0;

        while (true) {
            String someString = in.next().toLowerCase();

            if (someString.equals("stop")) {
                break;
            }
            else {
                set.add(someString);
            }
        }

        for (String s : set) {
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
