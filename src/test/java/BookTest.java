import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before() {
        book1 = new Book("a book", "an author", "some genre");
    }

    @Test
    public void hasTitle() {
        assertEquals("a book", book1.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("an author", book1.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("some genre", book1.getGenre());
    }
}
