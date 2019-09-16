package stefan.tflc.misystems.zadatak.web.dto;

import stefan.tflc.misystems.zadatak.entity.User;

import stefan.tflc.misystems.zadatak.entity.Vehicle;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class RentDTO {

    private Long id;
    private Integer totalPrice;
    private User user;
    private Long userId;
    private Vehicle vehicle;
    private Long vehicleId;

}