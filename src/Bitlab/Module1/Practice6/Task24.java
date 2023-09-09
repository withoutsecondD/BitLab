package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char strAsChar[] = str.toCharArray();

        if (strAsChar[0] > 96 && strAsChar[0] < 123) {
            strAsChar[0] -= 32;
        }

        for (int i = 1; i < str.length(); i++) {
            if (strAsChar[i] > 96 && strAsChar[i] < 123 && strAsChar[i - 1] == 32) {
                strAsChar[i] -= 32;
            }
        }

        str = new String(strAsChar);
        System.out.println(str);
    }
}
