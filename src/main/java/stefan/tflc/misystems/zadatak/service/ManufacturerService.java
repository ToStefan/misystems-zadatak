package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;

public interface ManufacturerService {
    Set<ManufacturerDTO> findAll();
    ManufacturerDTO findById(Long id);
    ManufacturerDTO create(ManufacturerDTO jobDTO);
    ManufacturerDTO update(ManufacturerDTO jobDTO);
    void remove(Long id);
}