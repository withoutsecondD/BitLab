package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sampleText = in.next();

        if (sampleText.equalsIgnoreCase("java")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
