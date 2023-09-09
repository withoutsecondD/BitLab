package Bitlab.Module2.Practice11.Task7;

import java.util.ArrayList;

public class Student {
    String fullName;
    double averageGrade;

    static double getAverageGrade(ArrayList<Student> students) {
        double sum = 0;

        for (Student s : students) {
            sum += s.getAverageGrade();
        }

        return (sum / students.size());
    }

    public Student() {
    }

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
