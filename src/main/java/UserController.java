import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @GetMapping(value = "/registerUser/{name}{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        return "registerUser/{name}{email}";
    }

}
