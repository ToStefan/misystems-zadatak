package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;

public interface FuelTypeService {
    Set<FuelTypeDTO> findAll();
    FuelTypeDTO findById(Long id);
    FuelTypeDTO create(FuelTypeDTO jobDTO);
    FuelTypeDTO update(FuelTypeDTO jobDTO);
    void remove(Long id);
}