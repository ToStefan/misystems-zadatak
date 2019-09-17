package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;

public interface CarBodyTypeService {
    Set<CarBodyTypeDTO> findAll();
    PageDTO<CarBodyTypeDTO> findAll(Pageable pageable);
    CarBodyTypeDTO findById(Long id);
    CarBodyTypeDTO create(CarBodyTypeDTO jobDTO);
    CarBodyTypeDTO update(CarBodyTypeDTO jobDTO);
    void remove(Long id);
}