package stefan.tflc.misystems.zadatak.web.mapper;

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
        dto.setCode(entity.getCode());
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
        dto.setCode(entity.getCode());
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
    public FuelType toEntity(FuelTypeDTO dto) {
        FuelType entity = new FuelType();
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return entity;
    }

    @Override
    public FuelType toEntityWithId(FuelTypeDTO dto) {
        FuelType entity = new FuelType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
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