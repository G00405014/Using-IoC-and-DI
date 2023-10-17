import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LibraryController {

    private LibraryService libService;

    @Autowired
    public void setLibService(LibraryService libService) {
        this.libService = libService;
    }

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
        libService.addBook(book);
        return "Book added";
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return libService.getBooks();
    }
}
