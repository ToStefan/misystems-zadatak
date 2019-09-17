package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.RoleDTO;

public interface RoleService {
    Set<RoleDTO> findAll();
    PageDTO<RoleDTO> findAll(Pageable pageable);
    RoleDTO findById(Long id);
    RoleDTO create(RoleDTO jobDTO);
    RoleDTO update(RoleDTO jobDTO);
    void remove(Long id);
}