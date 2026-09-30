import jakarta.validation.constraints.*;
import lombok.*;

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
    private ZonedDateTime reservedAt;

    @NotBlank
    private String status;

    @NotBlank
    private String password;
}