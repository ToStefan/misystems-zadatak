package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import stefan.tflc.misystems.zadatak.repository.CarBodyTypeRepository;
import stefan.tflc.misystems.zadatak.service.CarBodyTypeService;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.CarBodyTypeMapper;

@Transactional
@AllArgsConstructor
@Service
public class CarBodyTypeServiceImpl implements CarBodyTypeService {

    private final CarBodyTypeRepository carbodytypeRepository;
    private final CarBodyTypeMapper carbodytypeMapper;

    @Override
    public Set<CarBodyTypeDTO> findAll() {
        return carbodytypeMapper.toDTOStripped(carbodytypeRepository.findAll());
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