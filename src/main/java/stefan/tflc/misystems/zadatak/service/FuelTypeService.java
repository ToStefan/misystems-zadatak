package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;

public interface FuelTypeService {
    Set<FuelTypeDTO> findAll();
    PageDTO<FuelTypeDTO> findAll(Pageable pageable);
    FuelTypeDTO findById(Long id);
    FuelTypeDTO create(FuelTypeDTO jobDTO);
    FuelTypeDTO update(FuelTypeDTO jobDTO);
    void remove(Long id);
}