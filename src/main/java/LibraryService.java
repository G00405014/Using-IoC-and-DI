import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(" New book added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        System.out.println("Fetching books");
        return books;
    }
}
