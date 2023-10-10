import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private EmailService emailService;

    public String registerUser(String name, String email) {
        emailService.sendWelcomeEmail(email);
        return "User registered: " + name + " and email: " + email;
    }
}
