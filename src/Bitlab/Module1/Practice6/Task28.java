package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char temp = ' ';

        String strArr[] = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            char wordArr[] = strArr[i].toCharArray();
            int k = wordArr.length - 1;
            for (int j = 0; j < wordArr.length / 2; j++) {
                temp = wordArr[j];
                wordArr[j] = wordArr[k];
                wordArr[k] = temp;
                k--;
            }

            String word = new String(wordArr);
            System.out.print(word + " ");
        }
    }
}
