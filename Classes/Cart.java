package Classes;
import java.util.*;

class Cart { // Object class
 
   

    // get books
    public List<Book> getBooks(Member member) {
        return member.getBooks();
    }
}