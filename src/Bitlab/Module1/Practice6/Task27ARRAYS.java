package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task27ARRAYS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int countNumbers = 1;
        int countOperators = 0;
        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i)) && str.charAt(i + 1) == ' ') {
                countNumbers++;
            }
            else if (str.charAt(i) != ' ' && !Character.isDigit(str.charAt(i))) {
                countOperators++;
            }
        }

        int numbers[] = new int[countNumbers];
        char operators[] = new char[countOperators];
        String numberContainer = "";
        int start = 0;

        for (int i = 0; i < countNumbers; i++) {
            for (int j = start; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j)) && j != str.length() - 1) {
                    numberContainer += str.charAt(j);
                }
                else {
                    if (j == str.length() - 1) {
                        numberContainer += str.charAt(j);
                        break;
                    }
                    start = j + 3;
                    break;
                }
            }

            numbers[i] = Integer.parseInt(numberContainer);
            numberContainer = "";
        }

        start = 0;

        for (int i = 0; i < countOperators; i++) {
            for (int j = start; j < str.length(); j++) {
                if (!Character.isDigit(str.charAt(j)) && str.charAt(j) != ' ') {
                    operators[i] = str.charAt(j);
                    start = j + 1;
                    break;
                }
            }
        }

        result = numbers[0];
        int numberIndex = 1;

        for (int j = 0; j < countOperators; j++) {
            switch (operators[j]) {
                case '+':
                    result += numbers[numberIndex];
                    numberIndex++;
                    break;
                case '-':
                    result -= numbers[numberIndex];
                    numberIndex++;
                    break;
                case '*':
                    result *= numbers[numberIndex];
                    numberIndex++;
                    break;
                case '/':
                    result /= numbers[numberIndex];
                    numberIndex++;
                    break;
            }
        }

        System.out.println(result);
    }
}
