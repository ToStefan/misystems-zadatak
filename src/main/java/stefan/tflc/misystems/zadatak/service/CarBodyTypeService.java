package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;

public interface CarBodyTypeService {
    Set<CarBodyTypeDTO> findAll();
    CarBodyTypeDTO findById(Long id);
    CarBodyTypeDTO create(CarBodyTypeDTO jobDTO);
    CarBodyTypeDTO update(CarBodyTypeDTO jobDTO);
    void remove(Long id);
}