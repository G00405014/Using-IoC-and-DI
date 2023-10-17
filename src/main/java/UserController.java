import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        return userService.registerUser(name, email);
    }

    @PostMapping("/registerUserBody")
    public String registerUserBody(@RequestBody user user) {
        return userService.registerUser(user.getName(), user.getEmail());
    }
}
