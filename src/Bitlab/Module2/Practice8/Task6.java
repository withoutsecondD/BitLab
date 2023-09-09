package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int a = in.nextInt();

            if (a == 0) {
                break;
            }
            else {
                arr.add(a);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            boolean isUnique = true;

            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j) && i != j) {
                    isUnique = false;
                }
            }

            if (!isUnique) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
