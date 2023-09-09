package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int someNumber = in.nextInt();

        System.out.println(check(someNumber));
    }

    public static String check(int num) {
        if (num%2 == 0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
