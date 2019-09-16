package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Manufacturer;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;

@Component
public class ManufacturerMapper implements Mapper<Manufacturer, ManufacturerDTO> {

    @Override
    public ManufacturerDTO toDTO(Manufacturer entity) {
        ManufacturerDTO dto = new ManufacturerDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<ManufacturerDTO> toDTO(Collection<Manufacturer> entities) {
        return entities
                    .stream()
                    .map(manufacturer -> toDTO(manufacturer))
                    .collect(Collectors.toSet());
    }

    @Override
    public ManufacturerDTO toDTOStripped(Manufacturer entity) {
        ManufacturerDTO dto = new ManufacturerDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<ManufacturerDTO> toDTOStripped(Collection<Manufacturer> entities) {
        return entities
                    .stream()
                    .map(manufacturer -> toDTOStripped(manufacturer))
                    .collect(Collectors.toSet());
    }

    @Override
    public Manufacturer toEntity(ManufacturerDTO dto) {
        Manufacturer entity = new Manufacturer();
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Manufacturer toEntityWithId(ManufacturerDTO dto) {
        Manufacturer entity = new Manufacturer();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Set<Manufacturer> toEntity(Collection<ManufacturerDTO> dtos) {
        return dtos
                    .stream()
                    .map(manufacturer -> toEntity(manufacturer))
                    .collect(Collectors.toSet());
    }

}