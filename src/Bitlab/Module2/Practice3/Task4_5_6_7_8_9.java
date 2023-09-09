package Bitlab.Module2.Practice3;

public class Task4_5_6_7_8_9 {
}

class Student {
    private int id;
    private String name;
    private String surname;
    private double gpa;

    Student() {
        id = 0;
        name = null;
        surname = null;
        gpa = 0;
    }

    Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return ("Student{id=" + id + ", name='" + name + "', surname='" + surname + "', gpa=" + gpa + "}");
    }
}

class StudentHouse {
    private String name;
    Student[] students = new Student[1000];
    private int size = 0;

    void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    void printStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    void deleteStudent(int i) {
        students[i] = null;
    }

    Student theBestStudent() {
        double maxGpa = Double.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getGpa() > maxGpa) {
                    maxGpa = students[i].getGpa();
                    index = i;
                }
            }
        }

        return students[index];
    }

    StudentHouse() {
       name = null;
    }

    StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}