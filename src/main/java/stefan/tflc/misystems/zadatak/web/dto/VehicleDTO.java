package stefan.tflc.misystems.zadatak.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stefan.tflc.misystems.zadatak.entity.CarBodyType;
import stefan.tflc.misystems.zadatak.entity.FuelType;
import stefan.tflc.misystems.zadatak.entity.Model;
import stefan.tflc.misystems.zadatak.entity.VehicleType;

@Getter
@Setter
@NoArgsConstructor
public class VehicleDTO {

    private Long id;
    private Model model;
    private Long modelId;
    private VehicleType vehicleType;
    private Long vehicletypeId;
    private FuelType fuelType;
    private Long fueltypeId;
    private Integer price;
    private CarBodyType carBodyType;
    private Long carbodytypeId;
    private Integer weight;
    private Integer horsePower;
    private Integer seatCount;
    private Integer doorCount;
    private String description;
    private String propulsion;
    private String transmission;
    private Integer trunkWeight;

}