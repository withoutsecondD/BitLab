package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = (in.nextLine()).toLowerCase();
        int count = 0;
        int maxCount = 0;
        String mostFrequentWord = "";
        String strArr[] = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = strArr[i];
            }
            count = 0;
        }

        System.out.println("Наиболее часто встречающееся слово: " + mostFrequentWord + " (повторяется " + maxCount + " раз(а))");
    }
}
