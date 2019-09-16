package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.RoleDTO;

public interface RoleService {
    Set<RoleDTO> findAll();
    RoleDTO findById(Long id);
    RoleDTO create(RoleDTO jobDTO);
    RoleDTO update(RoleDTO jobDTO);
    void remove(Long id);
}