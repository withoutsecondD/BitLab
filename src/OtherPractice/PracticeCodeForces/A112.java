package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstStr = (in.next()).toLowerCase();
        String secondStr = (in.next()).toLowerCase();
        boolean areEqual = true;

        for (int i = 0; i < firstStr.length(); i++) {
            if (firstStr.charAt(i) > secondStr.charAt(i)) {
                System.out.println("1");
                areEqual = false;
                break;
            }
            else if (firstStr.charAt(i) < secondStr.charAt(i)) {
                System.out.println("-1");
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            System.out.println("0");
        }
    }
}
