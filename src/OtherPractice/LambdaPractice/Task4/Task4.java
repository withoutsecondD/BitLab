package OtherPractice.LambdaPractice.Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> someNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            someNumbers.add(in.nextInt());
        }

        System.out.println("Even numbers of given list: ");
        someNumbers.stream()
                .filter(num -> num%2 == 0)
                .forEach(num -> System.out.print(num + " "));

        System.out.println("\n\nOdd numbers of given list: ");
        someNumbers.stream()
                .filter(num -> num%2 != 0)
                .forEach(num -> System.out.print(num + " "));
    }
}
