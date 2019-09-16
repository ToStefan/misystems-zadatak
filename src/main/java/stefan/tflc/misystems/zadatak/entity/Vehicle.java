package stefan.tflc.misystems.zadatak.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "model", nullable = false)
    private Model model;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_type", nullable = false)
    private VehicleType vehicleType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fuel_type", nullable = false)
    private FuelType fuelType;

    @OneToOne(targetEntity = Price.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "price", nullable = false)
    private Price price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "car_body_type", nullable = false)
    private CarBodyType carBodyType;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Column(name = "horse_power", nullable = false)
    private Integer horsePower;

    @Column(name = "seat_count", nullable = false)
    private Integer seatCount;

    @Column(name = "door_count", nullable = false)
    private Integer doorCount;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "propulsion", nullable = false)
    private String propulsion;

    @Column(name = "transmission", nullable = false)
    private String transmission;

    @Column(name = "trunk_weight", nullable = false)
    private Integer trunkWeight;

}