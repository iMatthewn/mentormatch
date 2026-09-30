import jakarta.validation.constraints.*;
import lombok.*;
@RestController
@RequestMapping("/mentor-slots")
public class MentorSlotController {
    private final MentorSlotService MentorSlotService;
    (UserService userService) {
        this.MentorSlotService = getMentorSlotService();
    }
    public UserService getMentorSlotService() {
        return MentorSlotService;
    }
}
