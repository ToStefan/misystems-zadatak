package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.ManufacturerRepository;
import stefan.tflc.misystems.zadatak.service.ManufacturerService;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;
import stefan.tflc.misystems.zadatak.web.mapper.ManufacturerMapper;

@Transactional
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerMapper manufacturerMapper;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository, ManufacturerMapper manufacturerMapper) {
    	this.manufacturerRepository = manufacturerRepository;
    	this.manufacturerMapper = manufacturerMapper;
    }

    @Override
    public Set<ManufacturerDTO> findAll() {
        return manufacturerMapper.toDTOStripped(manufacturerRepository.findAll());
    }

    @Override
    public PageDTO<ManufacturerDTO> findAll(Pageable pageable) {
        return manufacturerMapper.toPageDTO(manufacturerRepository.findAll(pageable), pageable);
	}

    @Override
    public ManufacturerDTO findById(Long id) {
        return manufacturerMapper.toDTO(manufacturerRepository.getOne(id));
    }

    @Override
    public ManufacturerDTO create(ManufacturerDTO manufacturerDTO) {
        return manufacturerMapper.toDTO(manufacturerRepository.save(manufacturerMapper.toEntity(manufacturerDTO)));
    }

    @Override
    public ManufacturerDTO update(ManufacturerDTO manufacturerDTO) {
        return manufacturerMapper.toDTO(manufacturerRepository.save(manufacturerMapper.toEntityWithId(manufacturerDTO)));
    }

    @Override
    public void remove(Long manufacturerId) {
        manufacturerRepository.deleteById(manufacturerId);
    }

}