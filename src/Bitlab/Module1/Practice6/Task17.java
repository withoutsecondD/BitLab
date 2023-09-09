package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();

        char s1Char[] = s1.toCharArray();
        char s2Char[] = new char[s2.length()];

        for (int i = 0; i < s2.length(); i++) {
            s2Char[i] = s2.charAt(s2.length() - (1 + i));
        }

        String s2Reversed = new String(s2Char);

        if (s1.equals(s2Reversed)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
