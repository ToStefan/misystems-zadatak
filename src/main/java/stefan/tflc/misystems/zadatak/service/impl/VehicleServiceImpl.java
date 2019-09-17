package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.VehicleRepository;
import stefan.tflc.misystems.zadatak.service.VehicleService;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;
import stefan.tflc.misystems.zadatak.web.mapper.VehicleMapper;

@Transactional
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, VehicleMapper vehicleMapper) {
    	this.vehicleRepository = vehicleRepository;
    	this.vehicleMapper = vehicleMapper;
    }

    @Override
    public Set<VehicleDTO> findAll() {
        return vehicleMapper.toDTOStripped(vehicleRepository.findAll());
    }

    @Override
    public PageDTO<VehicleDTO> findAll(Pageable pageable) {
        return vehicleMapper.toPageDTO(vehicleRepository.findAll(pageable), pageable);
	}

    @Override
    public VehicleDTO findById(Long id) {
        return vehicleMapper.toDTO(vehicleRepository.getOne(id));
    }

    @Override
    public VehicleDTO create(VehicleDTO vehicleDTO) {
        return vehicleMapper.toDTO(vehicleRepository.save(vehicleMapper.toEntity(vehicleDTO)));
    }

    @Override
    public VehicleDTO update(VehicleDTO vehicleDTO) {
        return vehicleMapper.toDTO(vehicleRepository.save(vehicleMapper.toEntityWithId(vehicleDTO)));
    }

    @Override
    public void remove(Long vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }

}