package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.CarBodyTypeRepository;
import stefan.tflc.misystems.zadatak.service.CarBodyTypeService;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.CarBodyTypeMapper;

@Transactional
@Service
public class CarBodyTypeServiceImpl implements CarBodyTypeService {

    private final CarBodyTypeRepository carbodytypeRepository;
    private final CarBodyTypeMapper carbodytypeMapper;

    public CarBodyTypeServiceImpl(CarBodyTypeRepository carbodytypeRepository, CarBodyTypeMapper carbodytypeMapper) {
    	this.carbodytypeRepository = carbodytypeRepository;
    	this.carbodytypeMapper = carbodytypeMapper;
    }

    @Override
    public Set<CarBodyTypeDTO> findAll() {
        return carbodytypeMapper.toDTOStripped(carbodytypeRepository.findAll());
    }

    @Override
    public PageDTO<CarBodyTypeDTO> findAll(Pageable pageable) {
        return carbodytypeMapper.toPageDTO(carbodytypeRepository.findAll(pageable), pageable);
	}

    @Override
    public CarBodyTypeDTO findById(Long id) {
        return carbodytypeMapper.toDTO(carbodytypeRepository.getOne(id));
    }

    @Override
    public CarBodyTypeDTO create(CarBodyTypeDTO carbodytypeDTO) {
        return carbodytypeMapper.toDTO(carbodytypeRepository.save(carbodytypeMapper.toEntity(carbodytypeDTO)));
    }

    @Override
    public CarBodyTypeDTO update(CarBodyTypeDTO carbodytypeDTO) {
        return carbodytypeMapper.toDTO(carbodytypeRepository.save(carbodytypeMapper.toEntityWithId(carbodytypeDTO)));
    }

    @Override
    public void remove(Long carbodytypeId) {
        carbodytypeRepository.deleteById(carbodytypeId);
    }

}