package OtherPractice.LambdaPractice.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ISum sum = (a, b) -> a + b;

        System.out.println(sum.getSum(in.nextInt(), in.nextInt()));
    }
}
