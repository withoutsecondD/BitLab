package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();

        if (w > 2 && w%2 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
