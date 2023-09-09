package Bitlab.Module2.Practice6;

public class Task7_8 {
}

class Employee {
    private int id;
    private String fullName;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public Employee(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface EmployeeInterface {
    Employee search(String name);
    Employee oldestEmployee();
    Employee smallestEmployee();
    void addEmployee(Employee e);
    void deleteEmployee(int id);
    void printEmployee();
}

class Application implements EmployeeInterface {
    Employee[] employees = new Employee[1000];
    int count = 0;

    public Employee search(String name) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getFullName().equals(name)) {
                return employees[i];
            }
        }

        return null;
    }

    public Employee oldestEmployee() {
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() > max) {
                max = employees[i].getAge();
                index = i;
            }
        }

        return employees[index];
    }

    public Employee smallestEmployee() {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() < min) {
                min = employees[i].getAge();
                index = i;
            }
        }

        return employees[index];
    }

    public void addEmployee(Employee e) {
        employees[count] = e;
        count++;
    }

    public void deleteEmployee(int id) {
        employees[id] = null;
    }

    public void printEmployee() {
        for (int i = 0; i < count; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
}