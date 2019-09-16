package stefan.tflc.misystems.zadatak.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fueltype")
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

}