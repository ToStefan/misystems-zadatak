package stefan.tflc.misystems.zadatak.service;

import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.ModelDTO;

public interface ModelService {
    Set<ModelDTO> findAll();
    PageDTO<ModelDTO> findAll(Pageable pageable);
    ModelDTO findById(Long id);
    ModelDTO create(ModelDTO jobDTO);
    ModelDTO update(ModelDTO jobDTO);
    void remove(Long id);
}