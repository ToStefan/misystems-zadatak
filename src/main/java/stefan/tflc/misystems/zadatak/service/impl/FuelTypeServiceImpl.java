package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.FuelTypeRepository;
import stefan.tflc.misystems.zadatak.service.FuelTypeService;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.FuelTypeMapper;

import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class FuelTypeServiceImpl implements FuelTypeService {

    private final FuelTypeRepository fueltypeRepository;
    private final FuelTypeMapper fueltypeMapper;

    @Override
    public Set<FuelTypeDTO> findAll() {
        return fueltypeMapper.toDTOStripped(fueltypeRepository.findAll());
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