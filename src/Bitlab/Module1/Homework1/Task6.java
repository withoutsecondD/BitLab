package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int result = x * x * x + 5 * x * y - 6 * z * y + z * z * z;

        System.out.println(result);
    }
}
