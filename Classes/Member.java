package Classes;

import java.util.ArrayList;
import java.util.List;
/*
 * 
 * Member: Represents a library member.
Properties: ID, name, borrowedBooks (a list of Books).
Methods: register(), borrowBook(Book book), returnBook(Book book).
 */

import Interfaces.Borrowable;

public class Member implements Borrowable {
    private int ID;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();
    
    Member(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void register() {
        System.out.println("\nMember " + name + " has been registered with ID " + ID);
    }
    
    @Override 
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println("\nBook " + book.getTitle() + " has been borrowed by " + name);
    }

    @Override 
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println("\nBook " + book.getTitle() + " has been returned by " + name);
    }

    // get books
    public List<Book> getBooks() {
        return borrowedBooks;
    }

    void displayBorrowedBooks() {
        for (Book book : getBooks()) {
            book.displayInfo();
        }
    }
    
}
