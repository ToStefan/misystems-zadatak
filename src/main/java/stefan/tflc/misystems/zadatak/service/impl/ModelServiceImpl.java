package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.ModelRepository;
import stefan.tflc.misystems.zadatak.service.ModelService;
import stefan.tflc.misystems.zadatak.web.dto.ModelDTO;
import stefan.tflc.misystems.zadatak.web.mapper.ModelMapper;

@Transactional
@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public ModelServiceImpl(ModelRepository modelRepository, ModelMapper modelMapper) {
    	this.modelRepository = modelRepository;
    	this.modelMapper = modelMapper;
    }

    @Override
    public Set<ModelDTO> findAll() {
        return modelMapper.toDTOStripped(modelRepository.findAll());
    }

    @Override
    public PageDTO<ModelDTO> findAll(Pageable pageable) {
        return modelMapper.toPageDTO(modelRepository.findAll(pageable), pageable);
	}

    @Override
    public ModelDTO findById(Long id) {
        return modelMapper.toDTO(modelRepository.getOne(id));
    }

    @Override
    public ModelDTO create(ModelDTO modelDTO) {
        return modelMapper.toDTO(modelRepository.save(modelMapper.toEntity(modelDTO)));
    }

    @Override
    public ModelDTO update(ModelDTO modelDTO) {
        return modelMapper.toDTO(modelRepository.save(modelMapper.toEntityWithId(modelDTO)));
    }

    @Override
    public void remove(Long modelId) {
        modelRepository.deleteById(modelId);
    }

}