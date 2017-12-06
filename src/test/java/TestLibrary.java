import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library testLibrary;
    Book testBook;
    Publisher testPublisher;

    @Before
    public void before() {
        testLibrary = new Library("Edinburgh");
        testBook = new Book("To Kill A Mockingbird", "Harper Lee", GenreType.DRAMA);
        testPublisher = new Publisher();
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, testLibrary.countBooks());
    }

    @Test
    public void canAddBook() {
        testPublisher.addBook(testBook);
        testLibrary.stockBook(testPublisher);
        assertEquals(1, testLibrary.countBooks());
    }
}
