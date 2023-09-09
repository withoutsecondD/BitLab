package Bitlab.Module1.Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height = in.nextInt();

        if (height >= 159 && height <= 171) {
            System.out.println("S");
        }
        else if (height >= 172 && height <= 177) {
            System.out.println("M");
        }
        else if (height >= 178 && height <= 183) {
            System.out.println("L");
        }
        else if (height >= 184 && height <= 189) {
            System.out.println("XL");
        }
    }
}
