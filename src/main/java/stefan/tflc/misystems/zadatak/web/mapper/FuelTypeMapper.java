package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.FuelType;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;

@Component
public class FuelTypeMapper implements Mapper<FuelType, FuelTypeDTO> {

    @Override
    public FuelTypeDTO toDTO(FuelType entity) {
        FuelTypeDTO dto = new FuelTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<FuelTypeDTO> toDTO(Collection<FuelType> entities) {
        return entities
                    .stream()
                    .map(fueltype -> toDTO(fueltype))
                    .collect(Collectors.toSet());
    }

    @Override
    public FuelTypeDTO toDTOStripped(FuelType entity) {
        FuelTypeDTO dto = new FuelTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<FuelTypeDTO> toDTOStripped(Collection<FuelType> entities) {
        return entities
                    .stream()
                    .map(fueltype -> toDTOStripped(fueltype))
                    .collect(Collectors.toSet());
    }

    @Override
    public PageDTO<FuelTypeDTO> toPageDTO(Page<FuelType> pages, Pageable pageable) {
        return new PageDTO<FuelTypeDTO>(pageable.getPageNumber(), 
                pageable.getPageSize(), 
                pages.getTotalElements(), 
                toDTOStripped(pages.getContent()));
    }

    @Override
    public FuelType toEntity(FuelTypeDTO dto) {
        FuelType entity = new FuelType();
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public FuelType toEntityWithId(FuelTypeDTO dto) {
        FuelType entity = new FuelType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Set<FuelType> toEntity(Collection<FuelTypeDTO> dtos) {
        return dtos
                    .stream()
                    .map(fueltype -> toEntity(fueltype))
                    .collect(Collectors.toSet());
    }

}