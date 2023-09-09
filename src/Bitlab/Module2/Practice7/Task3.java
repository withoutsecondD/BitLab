package Bitlab.Module2.Practice7;

public class Task3 {
    public static void main(String[] args) {
        Company company1 = new Company("Apple", null);
        Company company2 = new Company("Samsung", new Worker("Kye", "Hyun Kyung"));
        System.out.println(company1.getData());
        System.out.println(company2.getData());
    }
}

class Company {
    String name;
    Worker director;

    public String getData() throws NullPointerException {
        try {
            if (director == null) {
                throw new NullPointerException();
            }
            else {
                return ("Company name: " + name + ". Information about director -> " + director + ".");
            }
        }
        catch (NullPointerException e){
            return "Data not found";
        }
    }

    public Company() {
    }

    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }
}

class Worker {
    String name;
    String surname;

    @Override
    public String toString() {
        return (name + " " + surname);
    }

    public Worker() {
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

//class NullPointerException extends Exception {
//    public String getMessage() {
//        return "0";
//    }
//}