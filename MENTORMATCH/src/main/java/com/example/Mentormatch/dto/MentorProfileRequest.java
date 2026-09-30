import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentorProfileRequest {

    @NotBlank
    private String topic;
}