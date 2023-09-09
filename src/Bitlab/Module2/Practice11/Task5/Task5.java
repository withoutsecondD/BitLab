package Bitlab.Module2.Practice11.Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String str = in.next();

            if (str.equals("exit"))
                break;
            else
                list.add(str);
        }

        sortStringArr sortArray = (arr) -> {
            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).length() > arr.get(j).length()) {
                        String temp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        };

        sortArray.sortStringList(list);
        System.out.println(list);
    }
}
