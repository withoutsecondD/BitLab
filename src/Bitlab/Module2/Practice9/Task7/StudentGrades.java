package Bitlab.Module2.Practice9.Task7;

import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> grades;

    void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    void printStudentsAboveGrade(int threshold) {
        for (String s : grades.keySet()) {
            if (grades.get(s) > threshold) {
                System.out.println(s + ": " + grades.get(s));
            }
        }
    }

    public StudentGrades() {
        grades = new HashMap<>();
    }
}
