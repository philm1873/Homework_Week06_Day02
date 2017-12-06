import java.util.ArrayList;

public class Publisher {
    private ArrayList<Book> booksToPrint;

    public Publisher() {
        this.booksToPrint = new ArrayList<>();
    }

    public Book publishBook() {
        return this.booksToPrint.get(0);
    }

    public void addBook(Book inputBook) {
        this.booksToPrint.add(inputBook);
    }

    public int bookCount() {
        return this.booksToPrint.size();
    }
}
