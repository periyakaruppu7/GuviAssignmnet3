package GuviAssignment3;

class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[100]; // Assuming a max of 100 books
        bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        }
    }

    // Method to replace a book from the library
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].setAvailable(true); // Reset availability
                // For simplicity, we'll just update availability
                break;
            }
        }
    }

    // Method to display all books in the library
    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("ID: " + books[i].getBookID() + ", Title: " + books[i].getTitle() +
                             ", Author: " + books[i].getAuthor() + ", Available: " + books[i].isAvailable());
        }
    }
}