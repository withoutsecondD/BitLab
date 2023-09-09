package Bitlab.Module2.Practice5;

public class Task11 {
}

abstract class User {
    int id;
    String login;
    String password;

    abstract String getUserData();

    public User() {
    }

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
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
}

class Student extends User {
    String name;
    String surname;
    String group;
    double gpa;

    String getUserData() {
        return ("ID: " + id + " LOGIN: " + login + " PASSWORD: " + password + " NAME: " + name + " SURNAME: " + surname + " GROUP: " + group + " GPA: " + gpa);
    }

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

class Teacher extends User {
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    void addSubject(String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    String getUserData() {
        return ("ID: " + id + " LOGIN: " + login + " PASSWORD: " + password + " NICKNAME: " + nickName + " STATUS: " + status);
    }

    public Teacher() {
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }


}

class ERPSystem {
    User[] memory = new User[1000];
    int sizeOfUsers = 0;

    void addUser(User user) {
        memory[sizeOfUsers] = user;
        sizeOfUsers++;
    }

    void printTeacher() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    };

    void printStudent() {
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    };

    void printUser(int index) {
        if (memory[index - 1] != null) {
            System.out.println(memory[index - 1].getUserData());
        }
        else {
            System.out.println("No such user in this index");
        }
    };
}