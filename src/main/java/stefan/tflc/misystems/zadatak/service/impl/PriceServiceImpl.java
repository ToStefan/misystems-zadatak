package stefan.tflc.misystems.zadatak.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import stefan.tflc.misystems.zadatak.repository.PriceRepository;
import stefan.tflc.misystems.zadatak.service.PriceService;
import stefan.tflc.misystems.zadatak.web.dto.PriceDTO;
import stefan.tflc.misystems.zadatak.web.mapper.PriceMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;

    @Override
    public Set<PriceDTO> findAll() {
        return priceMapper.toDTOStripped(priceRepository.findAll());
    }

    @Override
    public PriceDTO findById(Long id) {
        return priceMapper.toDTO(priceRepository.getOne(id));
    }

    @Override
    public PriceDTO create(PriceDTO priceDTO) {
        return priceMapper.toDTO(priceRepository.save(priceMapper.toEntity(priceDTO)));
    }

    @Override
    public PriceDTO update(PriceDTO priceDTO) {
        return priceMapper.toDTO(priceRepository.save(priceMapper.toEntityWithId(priceDTO)));
    }

    @Override
    public void remove(Long priceId) {
        priceRepository.deleteById(priceId);
    }

}