package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.User;
import stefan.tflc.misystems.zadatak.web.dto.UserDTO;

@Component
public class UserMapper implements Mapper<User, UserDTO> {

    @Override
    public UserDTO toDTO(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setFirstname(entity.getFirstname());
        dto.setLastname(entity.getLastname());
        dto.setBornDate(entity.getBornDate());
        dto.setActive(entity.getActive());
        dto.setRoles(entity.getRoles());
        return dto;
    }

    @Override
    public Set<UserDTO> toDTO(Collection<User> entities) {
        return entities
                    .stream()
                    .map(user -> toDTO(user))
                    .collect(Collectors.toSet());
    }

    @Override
    public UserDTO toDTOStripped(User entity) {
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setFirstname(entity.getFirstname());
        dto.setLastname(entity.getLastname());
        dto.setBornDate(entity.getBornDate());
        dto.setActive(entity.getActive());
        return dto;
    }

    @Override
    public Set<UserDTO> toDTOStripped(Collection<User> entities) {
        return entities
                    .stream()
                    .map(user -> toDTOStripped(user))
                    .collect(Collectors.toSet());
    }

    @Override
    public PageDTO<UserDTO> toPageDTO(Page<User> pages, Pageable pageable) {
        return new PageDTO<UserDTO>(pageable.getPageNumber(), 
                pageable.getPageSize(), 
                pages.getTotalElements(), 
                toDTOStripped(pages.getContent()));
    }

    @Override
    public User toEntity(UserDTO dto) {
        User entity = new User();
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setFirstname(dto.getFirstname());
        entity.setLastname(dto.getLastname());
        entity.setBornDate(dto.getBornDate());
        entity.setActive(dto.getActive());
        entity.setRoles(dto.getRoles());
        return entity;
    }

    @Override
    public User toEntityWithId(UserDTO dto) {
        User entity = new User();
        entity.setId(dto.getId());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setFirstname(dto.getFirstname());
        entity.setLastname(dto.getLastname());
        entity.setBornDate(dto.getBornDate());
        entity.setActive(dto.getActive());
        entity.setRoles(dto.getRoles());
        return entity;
    }

    @Override
    public Set<User> toEntity(Collection<UserDTO> dtos) {
        return dtos
                    .stream()
                    .map(user -> toEntity(user))
                    .collect(Collectors.toSet());
    }

}