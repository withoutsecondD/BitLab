//package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int statements = in.nextInt();
        int x = 0;

        String arr[] = new String[statements];

        for (int i = 0; i < statements; i++) {
            arr[i] = in.next();
        }

        for (int i = 0; i < statements; i++) {
            if (arr[i].equals("++X") || arr[i].equals("X++")) {
                x++;
            }
            else if (arr[i].equals("--X") || arr[i].equals("X--")) {
                x--;
            }
        }

        System.out.println(x);
    }
}
