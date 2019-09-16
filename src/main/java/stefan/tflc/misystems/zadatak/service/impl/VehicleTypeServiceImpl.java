package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.VehicleTypeRepository;
import stefan.tflc.misystems.zadatak.service.VehicleTypeService;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.VehicleTypeMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VehicleTypeServiceImpl implements VehicleTypeService {

    private final VehicleTypeRepository vehicletypeRepository;
    private final VehicleTypeMapper vehicletypeMapper;

    @Override
    public Set<VehicleTypeDTO> findAll() {
        return vehicletypeMapper.toDTOStripped(vehicletypeRepository.findAll());
    }

    @Override
    public VehicleTypeDTO findById(Long id) {
        return vehicletypeMapper.toDTO(vehicletypeRepository.getOne(id));
    }

    @Override
    public VehicleTypeDTO create(VehicleTypeDTO vehicletypeDTO) {
        return vehicletypeMapper.toDTO(vehicletypeRepository.save(vehicletypeMapper.toEntity(vehicletypeDTO)));
    }

    @Override
    public VehicleTypeDTO update(VehicleTypeDTO vehicletypeDTO) {
        return vehicletypeMapper.toDTO(vehicletypeRepository.save(vehicletypeMapper.toEntityWithId(vehicletypeDTO)));
    }

    @Override
    public void remove(Long vehicletypeId) {
        vehicletypeRepository.deleteById(vehicletypeId);
    }

}