package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        System.out.println(check(someWord));
    }

    public static int check(String s1) {
        s1 = s1.toLowerCase();
        int count = 0;
        char vowens[] = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < vowens.length; j++) {
                if (s1.charAt(i) == vowens[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
