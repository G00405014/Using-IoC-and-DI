
public class UserService {


    private EmailService emailService;

    public String registerUser(String name, String email) {
        emailService.sendEmail(email);
        return "User registered: " + name + " and email: " + email;
    }
}
