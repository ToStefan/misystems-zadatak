package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.UserDTO;

public interface UserService {
    Set<UserDTO> findAll();
    UserDTO findById(Long id);
    UserDTO create(UserDTO jobDTO);
    UserDTO update(UserDTO jobDTO);
    void remove(Long id);
}