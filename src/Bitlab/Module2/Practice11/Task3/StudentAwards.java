package Bitlab.Module2.Practice11.Task3;

import java.util.ArrayList;

public class StudentAwards {
    Student theMostGPA(ArrayList<Student> students) {
        double max = Double.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).gpa > max) {
                max = students.get(i).gpa;
                index = i;
            }
        }

        return students.get(index);
    }

    Student theMostAge(ArrayList<Student> students) {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).age > max) {
                max = students.get(i).age;
                index = i;
            }
        }

        return students.get(index);
    }

    Student theLongFullName(ArrayList<Student> students) {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).fullName.length() > max) {
                max = students.get(i).fullName.length();
                index = i;
            }
        }

        return students.get(index);
    }

    Student theHighest(ArrayList<Student> students) {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).height > max) {
                max = students.get(i).height;
                index = i;
            }
        }

        return students.get(index);
    }
}
