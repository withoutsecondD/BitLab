package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("THEY ARE EQUAL");
        }
        else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
