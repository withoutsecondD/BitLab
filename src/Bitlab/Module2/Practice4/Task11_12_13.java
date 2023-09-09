package Bitlab.Module2.Practice4;

public class Task11_12_13 {
}

class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    void getData() {
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname + " LOGIN: " + login + " PASSWORD: " + password);
    }

    public User() {
    }

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    @Override
    void getData() {
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname + " LOGIN: " + login + " PASSWORD: " + password + " SALARY: " + salary + "\n" + "SUBJECTS:");
        printSubjects();
    }

    void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    void printSubjects() {
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    @Override
    void getData() {
        System.out.println("ID: " + id + " FULL NAME: " + name + " " + surname + " LOGIN: " + login + " PASSWORD: " + password + " GPA: " + gpa + "\n" + "COURSES:");
        printCourses();
    }

    void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    void printCourses() {
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}