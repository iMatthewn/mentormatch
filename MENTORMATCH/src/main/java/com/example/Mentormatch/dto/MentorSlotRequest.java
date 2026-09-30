import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentorSlotRequest {
    @NotBlank
    private ZoneDateTime startTime;

    @NotBlank
    private ZoneDateTime endtime;

    @NotBlank
    private Integer capacity;

}