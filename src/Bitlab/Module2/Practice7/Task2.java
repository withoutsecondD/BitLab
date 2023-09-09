package Bitlab.Module2.Practice7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        try {
            System.out.println(a / b);
        }
        catch (Exception e) {
            System.out.println("Division by zero");
        }
    }
}

