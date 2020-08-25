import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBook(Library library, Book book) {
        if (library.getBooks().contains(book))
        this.borrowedBooks.add(book);
    }

    public int totalBorrowed() {
        return this.borrowedBooks.size();
    }
}
