package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Vehicle;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;

@Component
public class VehicleMapper implements Mapper<Vehicle, VehicleDTO> {

    @Override
    public VehicleDTO toDTO(Vehicle entity) {
        VehicleDTO dto = new VehicleDTO();
        dto.setId(entity.getId());
        dto.setModel(entity.getModel());
        dto.setVehicleType(entity.getVehicleType());
        dto.setFuelType(entity.getFuelType());
        dto.setCarBodyType(entity.getCarBodyType());
        dto.setPrice(entity.getPrice());
        dto.setWeight(entity.getWeight());
        dto.setHorsePower(entity.getHorsePower());
        dto.setSeatCount(entity.getSeatCount());
        dto.setDoorCount(entity.getDoorCount());
        dto.setDescription(entity.getDescription());
        dto.setPropulsion(entity.getPropulsion());
        dto.setTransmission(entity.getTransmission());
        dto.setTrunkWeight(entity.getTrunkWeight());
        return dto;
    }

    @Override
    public Set<VehicleDTO> toDTO(Collection<Vehicle> entities) {
        return entities
                    .stream()
                    .map(vehicle -> toDTO(vehicle))
                    .collect(Collectors.toSet());
    }

    @Override
    public VehicleDTO toDTOStripped(Vehicle entity) {
        VehicleDTO dto = new VehicleDTO();
        dto.setId(entity.getId());
        dto.setModelId(entity.getModel().getId());
        dto.setVehicleTypeId(entity.getVehicleType().getId());
        dto.setFuelTypeId(entity.getFuelType().getId());
        dto.setCarBodyTypeId(entity.getCarBodyType().getId());
        dto.setPrice(entity.getPrice());
        dto.setWeight(entity.getWeight());
        dto.setHorsePower(entity.getHorsePower());
        dto.setSeatCount(entity.getSeatCount());
        dto.setDoorCount(entity.getDoorCount());
        dto.setDescription(entity.getDescription());
        dto.setPropulsion(entity.getPropulsion());
        dto.setTransmission(entity.getTransmission());
        dto.setTrunkWeight(entity.getTrunkWeight());
        return dto;
    }

    @Override
    public Set<VehicleDTO> toDTOStripped(Collection<Vehicle> entities) {
        return entities
                    .stream()
                    .map(vehicle -> toDTOStripped(vehicle))
                    .collect(Collectors.toSet());
    }

    @Override
    public PageDTO<VehicleDTO> toPageDTO(Page<Vehicle> pages, Pageable pageable) {
        return new PageDTO<VehicleDTO>(pageable.getPageNumber(), 
                pageable.getPageSize(), 
                pages.getTotalElements(), 
                toDTOStripped(pages.getContent()));
    }

    @Override
    public Vehicle toEntity(VehicleDTO dto) {
        Vehicle entity = new Vehicle();
        entity.setModel(dto.getModel());
        entity.setVehicleType(dto.getVehicleType());
        entity.setFuelType(dto.getFuelType());
        entity.setCarBodyType(dto.getCarBodyType());
        entity.setPrice(dto.getPrice());
        entity.setWeight(dto.getWeight());
        entity.setHorsePower(dto.getHorsePower());
        entity.setSeatCount(dto.getSeatCount());
        entity.setDoorCount(dto.getDoorCount());
        entity.setDescription(dto.getDescription());
        entity.setPropulsion(dto.getPropulsion());
        entity.setTransmission(dto.getTransmission());
        entity.setTrunkWeight(dto.getTrunkWeight());
        return entity;
    }

    @Override
    public Vehicle toEntityWithId(VehicleDTO dto) {
        Vehicle entity = new Vehicle();
        entity.setId(dto.getId());
        entity.setModel(dto.getModel());
        entity.setVehicleType(dto.getVehicleType());
        entity.setFuelType(dto.getFuelType());
        entity.setCarBodyType(dto.getCarBodyType());
        entity.setPrice(dto.getPrice());
        entity.setWeight(dto.getWeight());
        entity.setHorsePower(dto.getHorsePower());
        entity.setSeatCount(dto.getSeatCount());
        entity.setDoorCount(dto.getDoorCount());
        entity.setDescription(dto.getDescription());
        entity.setPropulsion(dto.getPropulsion());
        entity.setTransmission(dto.getTransmission());
        entity.setTrunkWeight(dto.getTrunkWeight());
        return entity;
    }

    @Override
    public Set<Vehicle> toEntity(Collection<VehicleDTO> dtos) {
        return dtos
                    .stream()
                    .map(vehicle -> toEntity(vehicle))
                    .collect(Collectors.toSet());
    }

}