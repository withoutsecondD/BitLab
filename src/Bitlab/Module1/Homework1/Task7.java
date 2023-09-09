package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int V = a * b * c;
        int S = 2 * (a * b + a * c + b * c);

        System.out.println(V + " " + S);
    }
}
