package stefan.tflc.misystems.zadatak.web.dto;

import stefan.tflc.misystems.zadatak.entity.Manufacturer;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class ModelDTO {

    private Long id;
    private String name;
    private Manufacturer manufacturer;
    private Long manufacturerId;

}