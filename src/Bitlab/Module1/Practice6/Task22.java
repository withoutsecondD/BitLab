package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        char charArr[] = someWord.toCharArray();

        for (int i = 0; i < someWord.length(); i++) {
            if (charArr[i] > 47 && charArr[i] < 58) {
                charArr[i] = '0';
            }
        }

        someWord = new String(charArr);

        System.out.println(someWord);
    }
}
