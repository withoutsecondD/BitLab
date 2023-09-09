package Bitlab.Module2.Practice2;

public class Task13 {
    public static void main(String[] args) {

    }
}

class Book {
    int id;
    String bookName;
    String authorName;

    public Book() {
        this.id = 0;
        this.bookName = null;
        this.authorName = null;
    }

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    String getData() {
        return ("ID: " + id + " Name: " + bookName + " Author: " + authorName);
    }
}

class BookHouse {
    Book[] books = new Book[1000];
    int size = 0;

    void addBook(Book book) {
        books[size] = book;
        size++;
    }

    void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getData());
            }
            else {
                break;
            }
        }
    }

    void searchBook(String name) {
        boolean bookExists = false;
        int index = 0;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].bookName == name) {
                    bookExists = true;
                    index = i;
                }
            }
            else {
                break;
            }
        }

        if (bookExists) {
            System.out.println(books[index].getData());
        }
        else {
            System.out.println("Data Not Found");
        }
    }
}
