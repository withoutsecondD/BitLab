package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        char someLetter = in.next().charAt(0);

        System.out.println(check(someWord, someLetter));
    }

    static int check(String str, char letter) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }
}
