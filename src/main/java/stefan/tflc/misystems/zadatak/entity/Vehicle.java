package stefan.tflc.misystems.zadatak.entity;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "car_body_type", nullable = false)
    private CarBodyType carBodyType;

    @Column(name = "price", nullable = false)
    private String price;

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

    public Vehicle(){

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Model getModel() {
        return this.model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarBodyType getCarBodyType() {
        return this.carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getSeatCount() {
        return this.seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Integer getDoorCount() {
        return this.doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropulsion() {
        return this.propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getTrunkWeight() {
        return this.trunkWeight;
    }

    public void setTrunkWeight(Integer trunkWeight) {
        this.trunkWeight = trunkWeight;
    }

}