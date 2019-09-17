package stefan.tflc.misystems.zadatak.web.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import stefan.tflc.misystems.zadatak.entity.Model;
import stefan.tflc.misystems.zadatak.web.dto.ModelDTO;

@Component
public class ModelMapper implements Mapper<Model, ModelDTO> {

    @Override
    public ModelDTO toDTO(Model entity) {
        ModelDTO dto = new ModelDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setManufacturer(entity.getManufacturer());
        return dto;
    }

    @Override
    public Set<ModelDTO> toDTO(Collection<Model> entities) {
        return entities
                    .stream()
                    .map(model -> toDTO(model))
                    .collect(Collectors.toSet());
    }

    @Override
    public ModelDTO toDTOStripped(Model entity) {
        ModelDTO dto = new ModelDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setManufacturerId(entity.getManufacturer().getId());
        return dto;
    }

    @Override
    public Set<ModelDTO> toDTOStripped(Collection<Model> entities) {
        return entities
                    .stream()
                    .map(model -> toDTOStripped(model))
                    .collect(Collectors.toSet());
    }

    @Override
    public PageDTO<ModelDTO> toPageDTO(Page<Model> pages, Pageable pageable) {
        return new PageDTO<ModelDTO>(pageable.getPageNumber(), 
                pageable.getPageSize(), 
                pages.getTotalElements(), 
                toDTOStripped(pages.getContent()));
    }

    @Override
    public Model toEntity(ModelDTO dto) {
        Model entity = new Model();
        entity.setName(dto.getName());
        entity.setManufacturer(dto.getManufacturer());
        return entity;
    }

    @Override
    public Model toEntityWithId(ModelDTO dto) {
        Model entity = new Model();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setManufacturer(dto.getManufacturer());
        return entity;
    }

    @Override
    public Set<Model> toEntity(Collection<ModelDTO> dtos) {
        return dtos
                    .stream()
                    .map(model -> toEntity(model))
                    .collect(Collectors.toSet());
    }

}