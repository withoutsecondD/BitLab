package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        char operator = in.next().charAt(0);

        System.out.println(check(firstNum, secondNum, operator));
    }

    public static int check(int a, int b, char c) {
        switch (c) {
            case '+':
                return(a + b);
            case '-':
                return(a - b);
            case '*':
                return(a * b);
            case '/':
                return(a / b);
            default:
                return Integer.MIN_VALUE;
        }
    }
}
