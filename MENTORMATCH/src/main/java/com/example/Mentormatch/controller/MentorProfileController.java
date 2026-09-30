import jakarta.validation.constraints.*;
import lombok.*;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/mentor-profile")
public class MentorProfileController {
    private final MentorProfileService mentorprofileservice;
    (UserService userService) {
        this.mentorprofileservice = getMentorprofileservice();
    }
    public MentorProfileService getMentorprofileservice() {
        return mentorprofileservice;
    }
}