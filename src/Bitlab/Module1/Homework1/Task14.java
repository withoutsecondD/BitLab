package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sold = in.nextInt();

        int prize = (sold * 5000) * 5 / 100;

        System.out.println(prize);
    }
}
