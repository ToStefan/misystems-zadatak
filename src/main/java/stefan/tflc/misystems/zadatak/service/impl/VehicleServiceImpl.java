package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.VehicleRepository;
import stefan.tflc.misystems.zadatak.service.VehicleService;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;
import stefan.tflc.misystems.zadatak.web.mapper.VehicleMapper;

import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    @Override
    public Set<VehicleDTO> findAll() {
        return vehicleMapper.toDTOStripped(vehicleRepository.findAll());
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