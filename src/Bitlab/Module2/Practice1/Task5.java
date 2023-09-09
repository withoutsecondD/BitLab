package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        contains(str1, str2);
    }

    static void contains(String str1, String str2) {
        boolean contains = false;

        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(0) == str1.charAt(i)) {
                int l = i;
                for (int k = 0; k < str2.length(); k++) {
                    if (str2.charAt(k) == str1.charAt(l)) {
                        contains = true;
                        l++;
                    }
                    else {
                        contains = false;
                        break;
                    }
                }
            }
        }

        if (contains) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
