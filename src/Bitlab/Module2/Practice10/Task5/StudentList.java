package Bitlab.Module2.Practice10.Task5;

import java.util.ArrayList;
import java.util.List;

public class StudentList <T extends Student> {
    List<T> students = new ArrayList<>();

    void addStudent(T student) {
        students.add(student);
    }

    void removeStudent(T student) {
        students.remove(student);
    }

    T getHighestGpaStudent() {
        double max = Double.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGpa() > max) {
                max = students.get(i).getGpa();
                index = i;
            }
        }

        return  students.get(index);
    }

    void sortByLastName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getLastName().compareTo(students.get(j).getLastName()) > 0) {
                    T temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    List<T> getStudents() {
        return students;
    }

    public StudentList() {
    }

    void swap(int index1, int index2) {
        T temp = students.get(index1);
        students.set(index1, students.get(index2));
        students.set(index2, temp);
    }

    public StudentList(List<T> students) {
        this.students = students;
    }
}
