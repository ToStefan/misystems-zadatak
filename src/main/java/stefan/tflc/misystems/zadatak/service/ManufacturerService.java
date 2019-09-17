package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;

public interface ManufacturerService {
    Set<ManufacturerDTO> findAll();
    PageDTO<ManufacturerDTO> findAll(Pageable pageable);
    ManufacturerDTO findById(Long id);
    ManufacturerDTO create(ManufacturerDTO jobDTO);
    ManufacturerDTO update(ManufacturerDTO jobDTO);
    void remove(Long id);
}