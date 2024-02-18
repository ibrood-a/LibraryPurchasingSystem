package Classes;
/*Librarian: Inherits from Member, with additional responsibilities.
Methods: addBook(Book book), removeBook(Book book). */
import java.util.ArrayList;
import java.util.List;

import Interfaces.Borrowable;
import Interfaces.Manageable;
public class Librarian extends Member implements Manageable {
    private int ID;
    private String name;
    public BookStore store = new BookStore();
    private List<Book> borrowedBooks = new ArrayList<>();
    
    Librarian(int ID, String name) {
        super(ID, name);
        this.ID = ID;
        this.name = name;
    }
    
    @Override
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println("\n" + book.getTitle() + " has been borrowed by " + name);
    }
    
    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println("\n" + book.getTitle() + " has been returned by " + name);
    }
    
    @Override
    public void addBook(Book book) {
        store.addBook(book);
        System.out.println(book.getTitle() + " has been added by " + name);
    }
    
    @Override
    public void removeBook(Book book) {
        store.removeBook(book);
        System.out.println(book.getTitle() + " has been removed by " + name);
    }   
}
