package Interfaces;

import Classes.Book;

/*
 * Borrowable: An interface with methods borrowBook() and returnBook().
Manageable: An interface for Librarian class with methods addBook() and removeBook().
 */

public interface Manageable {
    void addBook(Book book);
    void removeBook(Book book);
}