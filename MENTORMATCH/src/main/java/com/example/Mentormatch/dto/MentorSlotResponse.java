package MentorProfileRequest.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MentorProfileResponse {
    @NotBlank
    private String id;

    @NotBlank
    private String mentorUsername;

    @NotBlank
    private String startTime;

    @NotBlank
    private String endTime;

    @NotBlank
    private String availableSeats;

    @NotBlank
    private String status;
}