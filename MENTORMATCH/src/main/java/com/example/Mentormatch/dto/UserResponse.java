package UserRequest.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    @NotBlank
    private string id;
    private String username;
    private String email;
}