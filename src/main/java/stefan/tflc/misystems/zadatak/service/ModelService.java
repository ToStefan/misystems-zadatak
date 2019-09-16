package stefan.tflc.misystems.zadatak.service;

import java.util.Set;
import stefan.tflc.misystems.zadatak.web.dto.ModelDTO;

public interface ModelService {
    Set<ModelDTO> findAll();
    ModelDTO findById(Long id);
    ModelDTO create(ModelDTO jobDTO);
    ModelDTO update(ModelDTO jobDTO);
    void remove(Long id);
}