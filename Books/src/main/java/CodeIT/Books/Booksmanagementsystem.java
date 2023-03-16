package CodeIT.Books;

import java.util.*;

class Book {
    private int bookid;
    private String bookName;
    private double bookPrice;
    private String authorName;
    private static String libraryName = "MyLibrary";
    private boolean availability;

    public void createBook(int id, String name, double price, String author, boolean available) {
         this.bookid = id;
        this.bookName = name;
        this.bookPrice = price;
        this.authorName = author;
        availability = available;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookid);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Author Name: " + authorName);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println();
    }

    public void displayBookByName(String name) {
        if (bookName.equals(name)) {
            displayBook();
        } else {
            System.out.println("Book not found!");
        }
    }

    public void borrowBook(String name) {
        if (bookName.equals(name)) {
            if (availability) {
                availability = false;
                System.out.println("Book borrowed successfully!");
            } else {
                System.out.println("Book not available for borrowing!");
            }
        } else {
            System.out.println("Book not found!");
        }
    }
}

public class Booksmanagementsystem 
{
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book();
        book1.createBook(101, "Java Programming", 99.99, "John Doe", true);

        Book book2 = new Book();
        book2.createBook(102, "Python Programming", 89.99, "Jane Doe", false);

        Book book3 = new Book();
        book3.createBook(103, "C Programming", 79.99, "Bob Smith", true);

        Book book4 = new Book();
        book4.createBook(104, "Data Structures and Algorithms", 109.99, "Alice Johnson", true);

        Book book5 = new Book();
        book5.createBook(105, "Database Systems", 119.99, "David Lee", false);

        // Display all books
        System.out.println("All Books:");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();
        book5.displayBook();

        // Display book by name
        System.out.println("Book by Name:");
        book4.displayBookByName("Data Structures and Algorithms");

        // Borrow book
        System.out.println("Borrow Book:");
        book5.borrowBook("Database Systems");
        book5.displayBook();
    }
}
