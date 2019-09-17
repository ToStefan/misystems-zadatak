package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.FuelTypeRepository;
import stefan.tflc.misystems.zadatak.service.FuelTypeService;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.FuelTypeMapper;

@Transactional
@Service
public class FuelTypeServiceImpl implements FuelTypeService {

    private final FuelTypeRepository fueltypeRepository;
    private final FuelTypeMapper fueltypeMapper;

    public FuelTypeServiceImpl(FuelTypeRepository fueltypeRepository, FuelTypeMapper fueltypeMapper) {
    	this.fueltypeRepository = fueltypeRepository;
    	this.fueltypeMapper = fueltypeMapper;
    }

    @Override
    public Set<FuelTypeDTO> findAll() {
        return fueltypeMapper.toDTOStripped(fueltypeRepository.findAll());
    }

    @Override
    public PageDTO<FuelTypeDTO> findAll(Pageable pageable) {
        return fueltypeMapper.toPageDTO(fueltypeRepository.findAll(pageable), pageable);
	}

    @Override
    public FuelTypeDTO findById(Long id) {
        return fueltypeMapper.toDTO(fueltypeRepository.getOne(id));
    }

    @Override
    public FuelTypeDTO create(FuelTypeDTO fueltypeDTO) {
        return fueltypeMapper.toDTO(fueltypeRepository.save(fueltypeMapper.toEntity(fueltypeDTO)));
    }

    @Override
    public FuelTypeDTO update(FuelTypeDTO fueltypeDTO) {
        return fueltypeMapper.toDTO(fueltypeRepository.save(fueltypeMapper.toEntityWithId(fueltypeDTO)));
    }

    @Override
    public void remove(Long fueltypeId) {
        fueltypeRepository.deleteById(fueltypeId);
    }

}