package Bitlab.Module2.Practice6;

public class Task5_6 {
}

class Account {
    int id;
    String name;
    String surname;
    double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account() {
    }

    public Account(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

interface BankApplicationInterface {
    void addAccount(Account a);
    void printAccounts();
    Account getMaxBalance();
}

class BankApplication implements BankApplicationInterface {
    String name;
    Account[] accounts = new Account[1000];
    int sizeOfAccount = 0;

    public void addAccount (Account a) {
        accounts[sizeOfAccount] = a;
        sizeOfAccount++;
    }

    public void printAccounts() {
        for (int i = 0; i < sizeOfAccount; i++) {
            System.out.println(accounts[i].toString());
        }
    }

    public Account getMaxBalance() {
        double max = Double.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < sizeOfAccount; i++) {
            if (accounts[i].getBalance() > max) {
                max = accounts[i].getBalance();
                index = i;
            }
        }

        return accounts[index];
    }

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}