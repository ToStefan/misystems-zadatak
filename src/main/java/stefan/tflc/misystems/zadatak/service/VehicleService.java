package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;

public interface VehicleService {
    Set<VehicleDTO> findAll();
    PageDTO<VehicleDTO> findAll(Pageable pageable);
    VehicleDTO findById(Long id);
    VehicleDTO create(VehicleDTO jobDTO);
    VehicleDTO update(VehicleDTO jobDTO);
    void remove(Long id);
}