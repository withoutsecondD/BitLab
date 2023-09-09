package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A339 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sum = in.next();
        char sumCharArr[] = sum.toCharArray();
        char temp = ' ';

        for (int i = 0; i < sum.length() - 2; i += 2) {
            for (int j = i + 2; j < sum.length(); j += 2) {
                if (sumCharArr[i] > sumCharArr[j]) {
                    temp = sumCharArr[i];
                    sumCharArr[i] = sumCharArr[j];
                    sumCharArr[j] = temp;
                }
            }
        }

        sum = new String(sumCharArr);
        System.out.println(sum);
    }
}
