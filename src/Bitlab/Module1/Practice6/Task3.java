package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sampleText = in.next();

        if (sampleText.equals("BITLAB")) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
     }
}
