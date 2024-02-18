package Classes;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Member member = new Member(1, "John Doe");
        Librarian librarian = new Librarian(2, "Jane Doe");

        // add a novel to the store
        librarian.addBook(new Novel("Atomic Habits", "James Clear", "9783442178582", 13.79, 1, "Self-help"));
        librarian.addBook(new Textbook("The 48 Laws of Power", "Robert Greene", "9780140280197", 14.55, 2, "Self-help"));
        librarian.addBook(new Novel("To Kill a Mockingbird", "Harper Lee", "9780061120084", 9.99, 3, "Fiction"));
        librarian.addBook(new Textbook("1984", "George Orwell", "9780451524935", 11.49, 4, "Fiction"));
        librarian.addBook(new Novel("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 8.99, 5, "Fiction"));
        librarian.addBook(new Textbook("Pride and Prejudice", "Jane Austen", "9780141439518", 7.99, 6, "Fiction"));
        librarian.addBook(new Novel("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 10.99, 7, "Fiction"));
        librarian.addBook(new Textbook("To the Lighthouse", "Virginia Woolf", "9780156907392", 12.99, 8, "Fiction"));
        librarian.addBook(new Novel("The Lord of the Rings", "J.R.R. Tolkien", "9780618640157", 19.99, 10, "Fantasy"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Display available books");
            System.out.println("2. Add book to cart");
            System.out.println("3. Checkout");
            int option = scanner.nextInt();
            scanner.nextLine();  
            switch (option) {
                case 1:
                    librarian.store.displayAvailableBooks();
                    break;
                case 2:
                    System.out.println("\nEnter book BookID:");

                    int bookID = scanner.nextInt();
                    Book book = librarian.store.searchBookByID(bookID);

                    if (book != null) {
                        member.borrowBook(book);
                        System.out.println("\nBook added to cart. Updated cart below:");
                        member.displayBorrowedBooks();
                    } else {
                        System.out.println("\nBook not found.");
                    }
                    break;
                case 3:
                    System.out.println("\nCart:");
                    member.displayBorrowedBooks();
                    System.out.println("Total: " + librarian.store.calculateTotal(member));
                    scanner.close();
                    return;
            }
        }
    }
}