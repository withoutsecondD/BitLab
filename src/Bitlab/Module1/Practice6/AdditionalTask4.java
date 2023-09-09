package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class AdditionalTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String uniqueLetters = "";

        for (int i = 0; i < str.length(); i++) {
            if (!uniqueLetters.contains(String.valueOf(str.charAt(i))) && str.charAt(i) != ' ') {
                uniqueLetters += str.charAt(i);
            }
        }

        System.out.println(uniqueLetters);
    }
}
