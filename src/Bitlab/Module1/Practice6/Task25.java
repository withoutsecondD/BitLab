package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char strAsChar[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (strAsChar[i] == '<') {
                for (int j = i + 2; j < str.length(); j++) {
                    if (strAsChar[j + 1] == '>') {
                        System.out.print(" ");
                        break;
                    }
                    else {
                        System.out.print(strAsChar[j]);
                    }
                }
            }
        }
    }
}
