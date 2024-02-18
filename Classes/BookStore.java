package Classes;
import java.util.*;

public class BookStore { // Object class  
    private List<Book> books = new ArrayList<>(); 

    public void displayHeader() {            
        // Header
        System.out.printf(
                "%-" + 25 + "s %-" + 25 + "s %-" + 13 + "s %-" + 10 + "s %-" + 5
                        + "s %s\n",
                "Title", "Author", "ISBN", "Price", "ID", "Subject");

        // Separator (adjust the '-' count to match column widths)
        System.out.printf(
                "%-" + 25 + "s %-" + 25 + "s %-" + 13 + "s %-" + 10 + "s %-" + 5
                        + "s %s\n",
                "-----", "------", "----", "-----", "--", "-------");

    }

    public void displayAvailableBooks() { 
        
        displayHeader();
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void displayBooksInCart(Member member) {
         
        displayHeader();
        for (Book book : member.getBooks()) {
            book.displayInfo();
        }
    }

    public Book searchBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    
    public double calculateTotal(Member member) { // calculateTotal() is a method that calculates the total price of the books in the cart
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }
} 