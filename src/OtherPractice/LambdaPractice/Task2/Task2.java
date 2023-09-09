package OtherPractice.LambdaPractice.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        checkEmptyInterface checker = (str) -> str.isEmpty();
        String str1 = "";

        if (checker.checkEmpty(str1)) {
            System.out.println("This string is empty");
        }
        else {
            System.out.println("This string is not empty");
        }
    }
}
