package Bitlab.Module2.Practice8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = 0;

        int n = in.nextInt();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList1.add(in.nextInt());
        }

        int m = in.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            arrayList2.add(in.nextInt());
        }

        for (int i = 0; i < arrayList1.size() - 1; i++) {
            for (int j = i + 1; j < arrayList1.size(); j++) {
                if (arrayList1.get(i) > arrayList1.get(j)) {
                    temp = arrayList1.get(i);
                    arrayList1.set(i, arrayList1.get(j));
                    arrayList1.set(j, temp);
                }
            }
        }

        for (int i = 0; i < arrayList2.size() - 1; i++) {
            for (int j = i + 1; j < arrayList2.size(); j++) {
                if (arrayList2.get(i) > arrayList2.get(j)) {
                    temp = arrayList2.get(i);
                    arrayList2.set(i, arrayList2.get(j));
                    arrayList2.set(j, temp);
                }
            }
        }

        System.out.println("Sorted first array: ");
        for (Integer i : arrayList1) {
            System.out.print(i + " ");
        }

        System.out.println("\nSorted second array: ");
        for (Integer i : arrayList2) {
            System.out.print(i + " ");
        }

        arrayList2.addAll(arrayList1);

        for (int i = 0; i < arrayList2.size() - 1; i++) {
            for (int j = i + 1; j < arrayList2.size(); j++) {
                if (arrayList2.get(i) > arrayList2.get(j)) {
                    temp = arrayList2.get(i);
                    arrayList2.set(i, arrayList2.get(j));
                    arrayList2.set(j, temp);
                }
            }
        }

        System.out.println("\nSorted third array: ");
        for (Integer i : arrayList2) {
            System.out.print(i + " ");
        }
    }
}
