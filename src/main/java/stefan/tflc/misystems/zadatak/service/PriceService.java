package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.PriceDTO;

public interface PriceService {
    Set<PriceDTO> findAll();
    PriceDTO findById(Long id);
    PriceDTO create(PriceDTO jobDTO);
    PriceDTO update(PriceDTO jobDTO);
    void remove(Long id);
}