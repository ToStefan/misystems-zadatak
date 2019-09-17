package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.VehicleTypeRepository;
import stefan.tflc.misystems.zadatak.service.VehicleTypeService;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;
import stefan.tflc.misystems.zadatak.web.mapper.VehicleTypeMapper;

@Transactional
@Service
public class VehicleTypeServiceImpl implements VehicleTypeService {

    private final VehicleTypeRepository vehicletypeRepository;
    private final VehicleTypeMapper vehicletypeMapper;

    public VehicleTypeServiceImpl(VehicleTypeRepository vehicletypeRepository, VehicleTypeMapper vehicletypeMapper) {
    	this.vehicletypeRepository = vehicletypeRepository;
    	this.vehicletypeMapper = vehicletypeMapper;
    }

    @Override
    public Set<VehicleTypeDTO> findAll() {
        return vehicletypeMapper.toDTOStripped(vehicletypeRepository.findAll());
    }

    @Override
    public PageDTO<VehicleTypeDTO> findAll(Pageable pageable) {
        return vehicletypeMapper.toPageDTO(vehicletypeRepository.findAll(pageable), pageable);
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