package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.UserDTO;

public interface UserService {
    Set<UserDTO> findAll();
    PageDTO<UserDTO> findAll(Pageable pageable);
    UserDTO findById(Long id);
    UserDTO create(UserDTO jobDTO);
    UserDTO update(UserDTO jobDTO);
    void remove(Long id);
}