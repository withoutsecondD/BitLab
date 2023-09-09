package Bitlab.Module2.Practice7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();

                System.out.println("Sum of numbers: " + (a + b));
                break;
            }
            catch (Exception e) {
                in.next();
                System.out.println("Error: Author data entered. Try again.");
            }
        }
    }
}
