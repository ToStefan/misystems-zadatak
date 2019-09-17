package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;

public interface Mapper<E, DTO> {
    DTO toDTO(E entity);
    Set<DTO> toDTO(Collection<E> entities);
    DTO toDTOStripped(E entity);
    Set<DTO> toDTOStripped(Collection<E> entities);
    PageDTO<DTO> toPageDTO(Page<E> pages, Pageable pageable);
    E toEntityWithId(DTO dto);
    E toEntity(DTO dto);
    Set<E> toEntity(Collection<DTO> dtos);
}