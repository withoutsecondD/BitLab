package Bitlab.Module2.Practice9.Task6;

import java.util.HashMap;

class University {
    HashMap<String, Integer> studentGrades = new HashMap<>();

    void addStudent(Student student) {
        studentGrades.put(student.getName(), student.getGrade());
    }
}
