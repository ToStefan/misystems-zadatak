package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;

public interface VehicleTypeService {
    Set<VehicleTypeDTO> findAll();
    PageDTO<VehicleTypeDTO> findAll(Pageable pageable);
    VehicleTypeDTO findById(Long id);
    VehicleTypeDTO create(VehicleTypeDTO jobDTO);
    VehicleTypeDTO update(VehicleTypeDTO jobDTO);
    void remove(Long id);
}