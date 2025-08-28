package elvis.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import elvis.modeloprojetofinal.users.dto.UserCreateDTO;
import elvis.modeloprojetofinal.users.dto.UserResponseDTO;
import elvis.modeloprojetofinal.users.entities.User;
import elvis.modeloprojetofinal.users.repositories.UserRepository;
import elvis.modeloprojetofinal.users.services.UserMapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toResponseDTO(userRepository.save(user));
    }
}
