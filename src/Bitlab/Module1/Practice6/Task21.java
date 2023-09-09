package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char strAsChar[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (strAsChar[i] > 64 && strAsChar[i] < 91) {
                strAsChar[i] += 32;
            }
            else if (strAsChar[i] > 96 && strAsChar[i] < 123) {
                strAsChar[i] -= 32;
            }
        }

        str = new String(strAsChar);
        System.out.println(str);
    }
}
