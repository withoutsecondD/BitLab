package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + " " + (i * i));
        }
    }
}
