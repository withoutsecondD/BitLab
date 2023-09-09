package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.nextLine();
        int count = 0;

        char arr[] = someWord.toCharArray();
        char alphabet[] = new char[] {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};

        for (int i = 0; i < someWord.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arr[i] == alphabet[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
