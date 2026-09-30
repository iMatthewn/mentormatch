import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private Long id;

    @NotBlank @Email
    private String email;


    @NotBlank @Size(min = 8)
    @Pattern(regexp = ".*[A-Za-z].*", message = "Debe contener un caracter")
    @Pattern(regexp = ".*[0-9].*", message = "Debe contener un numero")
    private String password;

    @NotBlank
    private String role;
}