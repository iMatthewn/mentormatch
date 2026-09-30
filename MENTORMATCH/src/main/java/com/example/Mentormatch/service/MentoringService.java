import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MentoringService {

    private final ModelMapper modelMapper;

    public MentoringService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Usuario convertirDtoAEntidad(MentoringRegistroDTO registroDTO) {
        Usuario usuario = modelMapper.map(registroDTO, Usuario.class);
        return usuario;
    }

    public UsuarioResponseDTO convertirEntidadADto(Usuario usuario) {
        UsuarioResponseDTO responseDTO = modelMapper.map(usuario, UsuarioResponseDTO.class);
        return responseDTO;
    }
}
