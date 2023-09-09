package Bitlab.Module1.Practice1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String companyName = in.next();
        int profit = in.nextInt();
        double month = in.nextDouble();

        System.out.println("Company " + companyName + " earns " + (profit / month) + " dollars in a month");
    }
}
