//package OtherPractice.PracticeCodeForces;

import java.util.Scanner;

public class A158 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfMembers = in.nextInt();
        int requiredGrade = in.nextInt();
        int passed = 0;
        int container = 0;

        int grades[] = new int[numberOfMembers];

        for (int i = 0; i < numberOfMembers; i++) {
            grades[i] = in.nextInt();
        }

        if (numberOfMembers >= requiredGrade) {
            for (int i = 0; i < grades.length - 1; i++) {
                for (int j = i + 1; j < grades.length; j++) {
                    if (grades[i] < grades[j]) {
                        container = grades[i];
                        grades[i] = grades[j];
                        grades[j] = container;
                    }
                }
            }

            for (int i = 0; i < numberOfMembers; i++) {
                if (grades[i] > grades[requiredGrade - 1] || grades[i] == grades[requiredGrade - 1]) {
                    if (grades[i] > 0) {
                        passed++;
                    }
                }
            }

            System.out.println(passed);
        }
    }
}
