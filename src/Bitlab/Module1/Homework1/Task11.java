package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int last = N - ((N / 60) * 60);

        System.out.println(last);
    }
}
