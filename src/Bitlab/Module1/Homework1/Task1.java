package Bitlab.Module1.Homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();
        String surname = in.next();
        String age = in.next();
        String country = in.next();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
