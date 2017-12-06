import java.util.ArrayList;

public class Library {
   private String name;
   private ArrayList<Book> stock;

    public Library(String inputName) {
        this.name = inputName;
        this.stock = new ArrayList<>();
    }

    public int countBooks() {
       return this.stock.size();
    }

    public void stockBook(Publisher inputPublisher){
        this.stock.add(inputPublisher.publishBook());
    }
}
