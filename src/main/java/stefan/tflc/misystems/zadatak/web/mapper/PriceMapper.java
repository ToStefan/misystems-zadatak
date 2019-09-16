package stefan.tflc.misystems.zadatak.web.mapper;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Price;
import stefan.tflc.misystems.zadatak.web.dto.PriceDTO;

@Component
public class PriceMapper implements Mapper<Price, PriceDTO> {

    @Override
    public PriceDTO toDTO(Price entity) {
        PriceDTO dto = new PriceDTO();
        dto.setId(entity.getId());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    @Override
    public Set<PriceDTO> toDTO(Collection<Price> entities) {
        return entities
                    .stream()
                    .map(price -> toDTO(price))
                    .collect(Collectors.toSet());
    }

    @Override
    public PriceDTO toDTOStripped(Price entity) {
        PriceDTO dto = new PriceDTO();
        dto.setId(entity.getId());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    @Override
    public Set<PriceDTO> toDTOStripped(Collection<Price> entities) {
        return entities
                    .stream()
                    .map(price -> toDTOStripped(price))
                    .collect(Collectors.toSet());
    }

    @Override
    public Price toEntity(PriceDTO dto) {
        Price entity = new Price();
        entity.setPrice(dto.getPrice());
        return entity;
    }

    @Override
    public Price toEntityWithId(PriceDTO dto) {
        Price entity = new Price();
        entity.setId(dto.getId());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    @Override
    public Set<Price> toEntity(Collection<PriceDTO> dtos) {
        return dtos
                    .stream()
                    .map(price -> toEntity(price))
                    .collect(Collectors.toSet());
    }

}