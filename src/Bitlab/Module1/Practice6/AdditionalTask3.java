package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();

        char vowels[] = {'a', 'e', 'i', 'o', 'u', 'y'};

        int countVowels = 0;
        int countConsonants = 0;
        boolean isVowel = false;
        String vowelLetters = "";
        String consonantLetters = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    countVowels++;
                    isVowel = true;
                    vowelLetters += str.charAt(i);
                    break;
                }
                isVowel = false;
            }

            if (!isVowel) {
                consonantLetters += str.charAt(i);
                countConsonants++;
            }
        }

        String vowelsStr = "";
        String consonantsStr = "";

        for (int i = 0; i < vowelLetters.length(); i++) {
            if (i != vowelLetters.length() - 1) {
                vowelsStr += vowelLetters.charAt(i) + ", ";
            }
            else {
                vowelsStr += vowelLetters.charAt(i);
            }
        }

        for (int i = 0; i < consonantLetters.length(); i++) {
            if (i != consonantLetters.length() - 1) {
                consonantsStr += consonantLetters.charAt(i) + ", ";
            }
            else {
                consonantsStr += consonantLetters.charAt(i);
            }
        }

        System.out.println("Количество гласных: " + countVowels + " (" + vowelsStr + ")");
        System.out.println("Количество согласных: " + countConsonants + " (" + consonantsStr + ")");
    }
}