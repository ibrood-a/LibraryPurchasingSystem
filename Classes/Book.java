package Classes;

public abstract class Book { // Object class
    private String title; // instance variables (data or "state") of the object
    private String author;
    private String ISBN;
    private double price;
    private int bookID;

    Book(String title, String author, String ISBN, double price, int bookID) { // constructor method initiliazes the
                                                                               // object
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.bookID = bookID;
    }

    abstract void displayInfo(); // abstract method to be implemented by subclasses

    public int getBookID() { // getBookID() is a method that returns the bookID
        return bookID;
    }

    public double getPrice() { // getPrice() is a method that returns the price
        return price;
    }

    public String getTitle() { // getTitle() is a method that returns the title
        return title;
    }

    public String getAuthor() { // getAuthor() is a method that returns the author
        return author;
    }

    public String getISBN() { // getISBN() is a method that returns the ISBN
        return ISBN;
    }

    // borrowBook()
    public void borrowBook() {
        System.out.println("Book " + title + " has been borrowed");
    }

    // returnBook()
    public void returnBook() {
        System.out.println("Book " + title + " has been returned");
    }
}

class Novel extends Book {
    private String genre;

    Novel(String title, String author, String ISBN, double price, int bookID, String genre) {
        super(title, author, ISBN, price, bookID);
        this.genre = genre;
    }

    @Override
    void displayInfo() {
        // Book data
        System.out.printf(
            "%-" + 25 + "s %-" + 25 + "s %-" + 14 + "s %-" + 10 + "s %-" + 5
                    + "s %s\n",
                getTitle(), getAuthor(), getISBN(), getPrice(), getBookID(), genre);
    }
}

class Textbook extends Book {
    private String subject;

    Textbook(String title, String author, String ISBN, double price, int bookID, String subject) {
        super(title, author, ISBN, price, bookID);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.printf(
            "%-" + 25 + "s %-" + 25 + "s %-" + 14 + "s %-" + 10 + "s %-" + 5
                    + "s %s\n",
                getTitle(), getAuthor(), getISBN(), getPrice(), getBookID(), subject);
    }
}