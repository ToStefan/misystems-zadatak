package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.CarBodyType;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;

@Component
public class CarBodyTypeMapper implements Mapper<CarBodyType, CarBodyTypeDTO> {

    @Override
    public CarBodyTypeDTO toDTO(CarBodyType entity) {
        CarBodyTypeDTO dto = new CarBodyTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCode(entity.getCode());
        return dto;
    }

    @Override
    public Set<CarBodyTypeDTO> toDTO(Collection<CarBodyType> entities) {
        return entities
                    .stream()
                    .map(carbodytype -> toDTO(carbodytype))
                    .collect(Collectors.toSet());
    }

    @Override
    public CarBodyTypeDTO toDTOStripped(CarBodyType entity) {
        CarBodyTypeDTO dto = new CarBodyTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCode(entity.getCode());
        return dto;
    }

    @Override
    public Set<CarBodyTypeDTO> toDTOStripped(Collection<CarBodyType> entities) {
        return entities
                    .stream()
                    .map(carbodytype -> toDTOStripped(carbodytype))
                    .collect(Collectors.toSet());
    }

    @Override
    public CarBodyType toEntity(CarBodyTypeDTO dto) {
        CarBodyType entity = new CarBodyType();
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return entity;
    }

    @Override
    public CarBodyType toEntityWithId(CarBodyTypeDTO dto) {
        CarBodyType entity = new CarBodyType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return entity;
    }

    @Override
    public Set<CarBodyType> toEntity(Collection<CarBodyTypeDTO> dtos) {
        return dtos
                    .stream()
                    .map(carbodytype -> toEntity(carbodytype))
                    .collect(Collectors.toSet());
    }

}