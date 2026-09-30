import jakarta.validation.constraints.*;
import lombok.*;
@RequestMapping("/mentoring-session")
public class MentoringSessionController {
    private final MentoringSessionService mentorprofileservice;
    (UserService userService) {
        this.mentorprofileservice = getMentoringSessionService();
    }
    public MentoringSessionService getMentoringSessionService() {
        return mentorprofileservice;
    }
}

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentorProfileRequest {
    @NotBlank
    private Long id;
    @NotBlank
    private Long slotId;
    @NotBlank
    private Long studentId;
    @NotBlank
    private String topic;
    @NotBlank
    private ZonedDateTime reserverAt;
    @NotBlank
    private String status;
}