import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreStock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genreStock = new HashMap<String, Integer>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public HashMap<String, Integer> getGenreStock() {
        return genreStock;
    }

    public int totalBooks() {
        return books.size();
    }

    public int totalGenreStock() {
        return genreStock.size();
    }

    public void addBook(Book book) {
        if (this.totalBooks() < capacity) {
            this.books.add(book);
            this.genreStock.put(book.getGenre(), 1);
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        for (String i : genreStock.keySet()) {
            if (genreStock.containsKey(book)) {
                int current = genreStock.get(i);
                genreStock.put(book.getGenre(), current-1);
            }
        }
    }
}
