package Bitlab.Module2.Practice7;

public class Task4 {
}

class Book {
    int id;
    String name;
    String author;

    String getData() {
        return ("ID: " + id + " NAME: " + name + " AUTHOR: " + author);
    }

    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    String name;
    String city;
    Book[] books = new Book[5];
    int index = 0;

    void addBook (Book book) throws ArrayIndexOutOfBoundsException {
        try {
            if (index >= 5) {
                throw new ArrayIndexOutOfBoundsException();
            }
            else {
                books[index] = book;
                index++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
    }

    void printBooks() throws NullPointerException {
        for (int i = 0; i < index; i++) {
            try {
                if (books[i] != null) {
                    System.out.println(books[i].getData());
                }
                else {
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException e) {
                System.out.println("The book is empty");
            }
        }
    }

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}