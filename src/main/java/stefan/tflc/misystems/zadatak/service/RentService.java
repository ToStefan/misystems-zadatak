package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.RentDTO;

public interface RentService {
    Set<RentDTO> findAll();
    RentDTO findById(Long id);
    RentDTO create(RentDTO jobDTO);
    RentDTO update(RentDTO jobDTO);
    void remove(Long id);
}