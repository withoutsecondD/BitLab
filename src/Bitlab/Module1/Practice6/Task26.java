package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char strAsChar[] = str.toCharArray();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (strAsChar[i] == ' ' || i == str.length() - 1) {

                if (i == str.length() - 1) {
                    count++;
                    i++;
                }

                char number[] = new char[count];

                for (int j = 0; j < count; j++) {
                    number[j] = strAsChar[i - count + j];
                }

                count = 0;
                String numberAsStr = new String(number);
                numberAsStr = numberAsStr.toLowerCase();

                switch (numberAsStr) {
                    case "zero" -> System.out.print("0 ");
                    case "one" -> System.out.print("1 ");
                    case "two" -> System.out.print("2 ");
                    case "three" -> System.out.print("3 ");
                    case "four" -> System.out.print("4 ");
                    case "five" -> System.out.print("5 ");
                    case "six" -> System.out.print("6 ");
                    case "seven" -> System.out.print("7 ");
                    case "eight" -> System.out.print("8 ");
                    case "nine" -> System.out.print("9 ");
                    default -> System.out.print(numberAsStr + " ");
                }
            }

            else {
                count++;
            }
        }
    }
}
