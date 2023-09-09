package Bitlab.Module2.Practice8.Task20;

import java.util.HashSet;
import java.util.Set;

public class Student {
    String name;
    Set<String> courses = new HashSet<>();

    void addCourse (String course) {
        courses.add(course);
    }

    void removeCourse (String course) {
        courses.remove(course);
    }

    void listCourses() {
        for (String s : courses) {
            System.out.println(s);
        }
    }

    public Student() {
    }

    public Student(String name, Set<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
