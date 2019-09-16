package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.RoleRepository;
import stefan.tflc.misystems.zadatak.service.RoleService;
import stefan.tflc.misystems.zadatak.web.dto.RoleDTO;
import stefan.tflc.misystems.zadatak.web.mapper.RoleMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    @Override
    public Set<RoleDTO> findAll() {
        return roleMapper.toDTOStripped(roleRepository.findAll());
    }

    @Override
    public RoleDTO findById(Long id) {
        return roleMapper.toDTO(roleRepository.getOne(id));
    }

    @Override
    public RoleDTO create(RoleDTO roleDTO) {
        return roleMapper.toDTO(roleRepository.save(roleMapper.toEntity(roleDTO)));
    }

    @Override
    public RoleDTO update(RoleDTO roleDTO) {
        return roleMapper.toDTO(roleRepository.save(roleMapper.toEntityWithId(roleDTO)));
    }

    @Override
    public void remove(Long roleId) {
        roleRepository.deleteById(roleId);
    }

}