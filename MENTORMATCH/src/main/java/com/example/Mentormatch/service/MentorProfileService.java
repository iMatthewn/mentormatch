import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MentorProfileService {

    private final ModelMapper modelMapper;

    public MentorProfileService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Usuario convertirDtoAEntidad(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = modelMapper.map(registroDTO, Usuario.class);
        return usuario;
    }

    public UsuarioResponseDTO convertirEntidadADto(Usuario usuario) {
        UsuarioResponseDTO responseDTO = modelMapper.map(usuario, UsuarioResponseDTO.class);
        return responseDTO;
    }
}
