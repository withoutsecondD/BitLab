package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int L = in.nextInt();

        double R = L / (2 * 3.14);
        double S = 3.14 * R;

        System.out.println(R + " " + S);
    }
}
