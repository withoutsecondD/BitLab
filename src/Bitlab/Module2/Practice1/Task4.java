package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();

        System.out.println(palindrome(someWord));
    }

    static String palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }
}

