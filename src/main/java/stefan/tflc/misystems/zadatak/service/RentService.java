package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.RentDTO;

public interface RentService {
    Set<RentDTO> findAll();
    PageDTO<RentDTO> findAll(Pageable pageable);
    RentDTO findById(Long id);
    RentDTO create(RentDTO jobDTO);
    RentDTO update(RentDTO jobDTO);
    void remove(Long id);
}