package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;

public interface VehicleService {
    Set<VehicleDTO> findAll();
    VehicleDTO findById(Long id);
    VehicleDTO create(VehicleDTO jobDTO);
    VehicleDTO update(VehicleDTO jobDTO);
    void remove(Long id);
}