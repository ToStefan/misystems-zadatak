package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Role;
import stefan.tflc.misystems.zadatak.web.dto.RoleDTO;

@Component
public class RoleMapper implements Mapper<Role, RoleDTO> {

    @Override
    public RoleDTO toDTO(Role entity) {
        RoleDTO dto = new RoleDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<RoleDTO> toDTO(Collection<Role> entities) {
        return entities
                    .stream()
                    .map(role -> toDTO(role))
                    .collect(Collectors.toSet());
    }

    @Override
    public RoleDTO toDTOStripped(Role entity) {
        RoleDTO dto = new RoleDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<RoleDTO> toDTOStripped(Collection<Role> entities) {
        return entities
                    .stream()
                    .map(role -> toDTOStripped(role))
                    .collect(Collectors.toSet());
    }

    @Override
    public Role toEntity(RoleDTO dto) {
        Role entity = new Role();
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Role toEntityWithId(RoleDTO dto) {
        Role entity = new Role();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Set<Role> toEntity(Collection<RoleDTO> dtos) {
        return dtos
                    .stream()
                    .map(role -> toEntity(role))
                    .collect(Collectors.toSet());
    }

}