import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(10);
        book1 = new Book("The Shining", "Stephen King", "Horror");
        book2 = new Book("Calum's Road", "Roger Hutchinson", "Biography");
        book3 = new Book("Do Android's Dream of Electric Sheep?", "Philip K. Dick", "Sci Fi");
    }

    @Test
    public void canAddBooks() {
        library.addBook(book1);
        assertEquals(1, library.totalBooks());
    }
}
