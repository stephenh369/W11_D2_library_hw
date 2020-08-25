import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library emptyLibrary;
    private Borrower borrower1;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(10);
        borrower1 = new Borrower();
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("Calum's Road", "Roger Hutchinson", "Biography");
        book3 = new Book("Do Android's Dream of Electric Sheep?", "Philip K. Dick", "Sci Fi");
    }

    @Test
    public void canAddBooks() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.totalBooks());
    }

    @Test
    public void libraryFull() {
        emptyLibrary = new Library(0);
        emptyLibrary.addBook(book2);
        emptyLibrary.addBook(book3);
        assertEquals(0, emptyLibrary.totalBooks());
    }

    @Test
    public void canRemoveBooks() {
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.totalBooks());
    }

    @Test
    public void checkOutBook() {
        library.addBook(book3);
        borrower1.borrowBook(library, book3);
        library.removeBook(book3);
        assertEquals(1, borrower1.totalBorrowed());
        assertEquals(0, library.totalBooks());
    }
}
