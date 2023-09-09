package Bitlab.Module2.Practice6;

public class Task1_2 {
}

class Users {
    String name;
    String surname;

    public Users() {
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

interface UserBean {
    void getAllUsers();
    void getUsersByName(String name);
    void getUsersBySurname(String surname);
}

class UserBeanImp implements UserBean {
    Users[] user;

    public UserBeanImp() {
    }

    public UserBeanImp(Users[] user) {
        this.user = user;
    }

    public void getAllUsers() {
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i].getName() + " " + user[i].getSurname());
        }
    }

    public void getUsersByName(String name) {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getName().equals(name)) {
                System.out.println(user[i].getName() + " " + user[i].getSurname());
            }
        }
    }

    public void getUsersBySurname(String surname) {
        for (int i = 0; i < user.length; i++) {
            if (user[i].getSurname().equals(surname)) {
                System.out.println(user[i].getName() + " " + user[i].getSurname());
            }
        }
    }
}