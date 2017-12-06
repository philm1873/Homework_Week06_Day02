import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPublisher {

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
    public void beginsEmpty() {
        assertEquals(0, testPublisher.bookCount());
    }

    @Test
    public void canAddBook() {
        testPublisher.addBook(testBook);
        assertEquals(1, testPublisher.bookCount());
    }

    @Test
    public void canPublishBook() {
        testPublisher.addBook(testBook);
        assertEquals(1, testPublisher.bookCount());
        assertEquals(testBook , testPublisher.publishBook());
    }
}
