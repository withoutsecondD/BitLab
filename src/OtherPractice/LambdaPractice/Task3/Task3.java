package OtherPractice.LambdaPractice.Task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        changeCaseInterface arrayToUpperCase = (ArrayList<String> strArr) -> {
            for (int i = 0; i < strArr.size(); i++) {
                strArr.set(i, strArr.get(i).toUpperCase());
            }
        };
        changeCaseInterface arrayToLowerCase = (ArrayList<String> strArr) -> {
            for (int i = 0; i < strArr.size(); i++) {
                strArr.set(i, strArr.get(i).toLowerCase());
            }
        };

        int n = in.nextInt();
        ArrayList<String> someStringsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            someStringsList.add(in.next());
        }

        System.out.println("List in uppercase: ");
        arrayToUpperCase.changeCase(someStringsList);
        System.out.println(someStringsList);

        System.out.println("List in lowercase: ");
        arrayToLowerCase.changeCase(someStringsList);
        System.out.println(someStringsList);
    }
}
