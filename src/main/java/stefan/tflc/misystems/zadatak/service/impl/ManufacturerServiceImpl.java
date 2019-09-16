package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.ManufacturerRepository;
import stefan.tflc.misystems.zadatak.service.ManufacturerService;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;
import stefan.tflc.misystems.zadatak.web.mapper.ManufacturerMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerMapper manufacturerMapper;

    @Override
    public Set<ManufacturerDTO> findAll() {
        return manufacturerMapper.toDTOStripped(manufacturerRepository.findAll());
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