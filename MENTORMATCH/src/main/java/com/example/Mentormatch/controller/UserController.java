import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor


@RestController
@RequestMapping("/auth/register")
public class UserController {
    private final UserService userService;
    (UserService userService) {
        this.userService = productService;
    }
    public UserService getUserService() {
        return userService;
    }
}