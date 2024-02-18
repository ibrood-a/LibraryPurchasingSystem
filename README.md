# Library Management System in Java

This project is a simplified library management system implemented in Java. It demonstrates the application of fundamental Java concepts like classes, interfaces, inheritance, polymorphism, and encapsulation.

## Project Structure

The project is organized into the following packages:

- **Classes**: This package contains the core classes of the system, including `Book`, `Member`, `Librarian`, `Store`, and their subclasses like `Novel` and `Textbook`.
  
- **Interfaces**: This package defines the interfaces `Borrowable` and `Manageable`, which are implemented by relevant classes to achieve polymorphism.

## Key Features

- Represents books with properties like ID, title, author, availability, and genre (using subclasses for specific book types).
  
- Implements members with the ability to register, borrow, and return books.
  
- Allows librarians to add and remove books from the library collection.
  
- Tracks book availability based on member borrows and returns.
  
- Includes a basic command-line interface for interacting with the system.

## How to Run

1. Ensure you have Java installed and configured on your system.
   
2. Clone or download the project repository.
   
3. Open a terminal in the project directory.
   
4. Compile the Java source files using a command like `javac -cp .:./lib/* Classes/*.java`.
   
5. Run the main application using `java -cp .:./lib/* Classes.BookStoreApp`.

## Functionality Demonstration

The provided `BookStoreApp` class demonstrates the core functionalities of the system. You can interact with it through the command-line interface:

- Choose option 1 to list all available books.
  
- Choose option 2 to search for a book by ID and add it to a member's cart (if available).
  
- Choose option 3 to view the borrowed books in the cart and checkout (showing the total price).
