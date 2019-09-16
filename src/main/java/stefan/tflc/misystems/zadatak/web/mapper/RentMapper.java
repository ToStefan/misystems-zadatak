package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Rent;
import stefan.tflc.misystems.zadatak.web.dto.RentDTO;

@Component
public class RentMapper implements Mapper<Rent, RentDTO> {

    @Override
    public RentDTO toDTO(Rent entity) {
        RentDTO dto = new RentDTO();
        dto.setId(entity.getId());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setUser(entity.getUser());
        dto.setVehicle(entity.getVehicle());
        return dto;
    }

    @Override
    public Set<RentDTO> toDTO(Collection<Rent> entities) {
        return entities
                    .stream()
                    .map(rent -> toDTO(rent))
                    .collect(Collectors.toSet());
    }

    @Override
    public RentDTO toDTOStripped(Rent entity) {
        RentDTO dto = new RentDTO();
        dto.setId(entity.getId());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setUserId(entity.getUser().getId());
        dto.setVehicleId(entity.getVehicle().getId());
        return dto;
    }

    @Override
    public Set<RentDTO> toDTOStripped(Collection<Rent> entities) {
        return entities
                    .stream()
                    .map(rent -> toDTOStripped(rent))
                    .collect(Collectors.toSet());
    }

    @Override
    public Rent toEntity(RentDTO dto) {
        Rent entity = new Rent();
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setUser(dto.getUser());
        entity.setVehicle(dto.getVehicle());
        return entity;
    }

    @Override
    public Rent toEntityWithId(RentDTO dto) {
        Rent entity = new Rent();
        entity.setId(dto.getId());
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setUser(dto.getUser());
        entity.setVehicle(dto.getVehicle());
        return entity;
    }

    @Override
    public Set<Rent> toEntity(Collection<RentDTO> dtos) {
        return dtos
                    .stream()
                    .map(rent -> toEntity(rent))
                    .collect(Collectors.toSet());
    }

}