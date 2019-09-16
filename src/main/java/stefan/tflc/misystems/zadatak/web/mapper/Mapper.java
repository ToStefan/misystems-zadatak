package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;

public interface Mapper<E, DTO> {
    DTO toDTO(E entity);
    Set<DTO> toDTO(Collection<E> entities);
    DTO toDTOStripped(E entity);
    Set<DTO> toDTOStripped(Collection<E> entities);
    E toEntityWithId(DTO dto);
    E toEntity(DTO dto);
    Set<E> toEntity(Collection<DTO> dtos);
}