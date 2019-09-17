package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.VehicleType;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;

@Component
public class VehicleTypeMapper implements Mapper<VehicleType, VehicleTypeDTO> {

    @Override
    public VehicleTypeDTO toDTO(VehicleType entity) {
        VehicleTypeDTO dto = new VehicleTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<VehicleTypeDTO> toDTO(Collection<VehicleType> entities) {
        return entities
                    .stream()
                    .map(vehicletype -> toDTO(vehicletype))
                    .collect(Collectors.toSet());
    }

    @Override
    public VehicleTypeDTO toDTOStripped(VehicleType entity) {
        VehicleTypeDTO dto = new VehicleTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public Set<VehicleTypeDTO> toDTOStripped(Collection<VehicleType> entities) {
        return entities
                    .stream()
                    .map(vehicletype -> toDTOStripped(vehicletype))
                    .collect(Collectors.toSet());
    }

    @Override
    public PageDTO<VehicleTypeDTO> toPageDTO(Page<VehicleType> pages, Pageable pageable) {
        return new PageDTO<VehicleTypeDTO>(pageable.getPageNumber(), 
                pageable.getPageSize(), 
                pages.getTotalElements(), 
                toDTOStripped(pages.getContent()));
    }

    @Override
    public VehicleType toEntity(VehicleTypeDTO dto) {
        VehicleType entity = new VehicleType();
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public VehicleType toEntityWithId(VehicleTypeDTO dto) {
        VehicleType entity = new VehicleType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    @Override
    public Set<VehicleType> toEntity(Collection<VehicleTypeDTO> dtos) {
        return dtos
                    .stream()
                    .map(vehicletype -> toEntity(vehicletype))
                    .collect(Collectors.toSet());
    }

}