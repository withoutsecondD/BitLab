package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String firstNumberStr = "";
        String secondNumberStr = "";
        char operation = ' ';
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                firstNumberStr += str.charAt(i);
            }
            else {
                index = i;
                break;
            }
        }

        operation = str.charAt(index + 1);

        for (int i = index + 3; i < str.length(); i++) {
            secondNumberStr += str.charAt(i);
        }

        int firstNumber = Integer.parseInt(firstNumberStr);
        int secondNumber = Integer.parseInt(secondNumberStr);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
        }
    }
}
