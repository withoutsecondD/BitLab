package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i].length() > 10) {
                System.out.println(arr[i].charAt(0) + "" + (arr[i].length() - 2) + arr[i].charAt(arr[i].length() - 1));
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
}
