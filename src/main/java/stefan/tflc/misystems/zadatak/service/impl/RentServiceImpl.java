package stefan.tflc.misystems.zadatak.service.impl;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import java.util.Set;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import stefan.tflc.misystems.zadatak.repository.RentRepository;
import stefan.tflc.misystems.zadatak.service.RentService;
import stefan.tflc.misystems.zadatak.web.dto.RentDTO;
import stefan.tflc.misystems.zadatak.web.mapper.RentMapper;

@Transactional
@Service
public class RentServiceImpl implements RentService {

    private final RentRepository rentRepository;
    private final RentMapper rentMapper;

    public RentServiceImpl(RentRepository rentRepository, RentMapper rentMapper) {
    	this.rentRepository = rentRepository;
    	this.rentMapper = rentMapper;
    }

    @Override
    public Set<RentDTO> findAll() {
        return rentMapper.toDTOStripped(rentRepository.findAll());
    }

    @Override
    public PageDTO<RentDTO> findAll(Pageable pageable) {
        return rentMapper.toPageDTO(rentRepository.findAll(pageable), pageable);
	}

    @Override
    public RentDTO findById(Long id) {
        return rentMapper.toDTO(rentRepository.getOne(id));
    }

    @Override
    public RentDTO create(RentDTO rentDTO) {
        return rentMapper.toDTO(rentRepository.save(rentMapper.toEntity(rentDTO)));
    }

    @Override
    public RentDTO update(RentDTO rentDTO) {
        return rentMapper.toDTO(rentRepository.save(rentMapper.toEntityWithId(rentDTO)));
    }

    @Override
    public void remove(Long rentId) {
        rentRepository.deleteById(rentId);
    }

}