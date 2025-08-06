package GuviAssignment3;

public class BookManagementSystem {
	public static void main(String[] args) {
        Library library = new Library();

        // Example interaction
        library.addBook(new Book(1, "Java Basics", "John Doe", true));
        library.addBook(new Book(2, "OOP Concepts", "Jane Smith", false));
        library.displayBooks();

        // Replace a book
        library.replaceBook(1, "Advanced Java", "John Doe");
        library.displayBooks();
	}
}
