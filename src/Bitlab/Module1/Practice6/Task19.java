package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numberLetter = in.next();

        int a = Integer.parseInt((String.valueOf(numberLetter.charAt(0))));
        char letter = numberLetter.charAt(1);

        System.out.println(letter + "" + (a * 2));
    }
}
