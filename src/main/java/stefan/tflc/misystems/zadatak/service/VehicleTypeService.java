package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;

public interface VehicleTypeService {
    Set<VehicleTypeDTO> findAll();
    VehicleTypeDTO findById(Long id);
    VehicleTypeDTO create(VehicleTypeDTO jobDTO);
    VehicleTypeDTO update(VehicleTypeDTO jobDTO);
    void remove(Long id);
}