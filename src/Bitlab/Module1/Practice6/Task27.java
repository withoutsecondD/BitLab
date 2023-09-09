package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        char operator1 = in.next().charAt(0);
        int number2 = in.nextInt();
        char operator2 = in.next().charAt(0);
        int number3 = in.nextInt();

        switch (operator2) {
            case '*':
                switch (operator1) {
                    case '+':
                        System.out.println(number1 + (number2 * number3));
                        break;
                    case '-':
                        System.out.println(number1 - (number2 * number3));
                        break;
                    case '*':
                        System.out.println(number1 * number2 * number3);
                        break;
                    case '/':
                        System.out.println(number1 / number2 * number3);
                        break;
                }
                break;
            case '/':
                switch (operator1) {
                    case '+':
                        System.out.println(number1 + (number2 / number3));
                        break;
                    case '-':
                        System.out.println(number1 - (number2 / number3));
                        break;
                    case '*':
                        System.out.println(number1 * number2 / number3);
                        break;
                    case '/':
                        System.out.println(number1 / number2 / number3);
                        break;
                }
                break;
            case '+':
                switch (operator1) {
                    case '+':
                        System.out.println(number1 + number2 + number3);
                        break;
                    case '-':
                        System.out.println(number1 - number2 + number3);
                        break;
                    case '*':
                        System.out.println(number1 * number2 + number3);
                        break;
                    case '/':
                        System.out.println(number1 / number2 + number3);
                        break;
                }
                break;
            case '-':
                switch (operator1) {
                    case '+':
                        System.out.println(number1 + number2 - number3);
                        break;
                    case '-':
                        System.out.println(number1 - number2 - number3);
                        break;
                    case '*':
                        System.out.println(number1 * number2 - number3);
                        break;
                    case '/':
                        System.out.println(number1 / number2 - number3);
                        break;
                }
                break;
        }

    }
}
