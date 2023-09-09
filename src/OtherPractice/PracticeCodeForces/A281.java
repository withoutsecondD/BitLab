package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        char someWordChar[] = someWord.toCharArray();

        if (someWordChar[0] > 96 && someWordChar[0] < 123) {
            someWordChar[0] -= 32;
        }

        someWord = new String(someWordChar);
        System.out.println(someWord);
    }
}
