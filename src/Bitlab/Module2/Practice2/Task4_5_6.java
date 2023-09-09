package Bitlab.Module2.Practice2;

public class Task4_5_6 {
    public class Student  {
        int id;
        String name;
        String surname;
        double gpa;

        public Student() {
            this.id = 0;
            this.name = "N/A";
            this.surname = "N/A";
            this.gpa = 0;
        }

        public Student(int id, String name, String surname, double gpa) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.gpa = gpa;
        }

        String getStudentData() {
            return ("ID: " + id + " Full Name: " + name + " " + surname + " GPA: " + gpa);
        }
    }

    public static void main(String[] args) {

    }
}
