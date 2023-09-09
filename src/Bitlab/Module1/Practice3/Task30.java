package Bitlab.Module1.Practice3;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int price = in.nextInt();
        int money = in.nextInt();
        int bananas = in.nextInt();
        int totalExpense = 0;

        for (int i = 1; i <= bananas; i++) {
            totalExpense += i * price;
        }

        if (totalExpense > money) {
            System.out.println(totalExpense - money);
        }
        else {
            System.out.println("0");
        }
    }
}
