package stefan.tflc.misystems.zadatak.web.dto;

import stefan.tflc.misystems.zadatak.entity.Model;

import stefan.tflc.misystems.zadatak.entity.VehicleType;

import stefan.tflc.misystems.zadatak.entity.FuelType;

import stefan.tflc.misystems.zadatak.entity.CarBodyType;

public class VehicleDTO {

    private Long id;
    private Model model;
    private Long modelId;
    private VehicleType vehicleType;
    private Long vehicleTypeId;
    private FuelType fuelType;
    private Long fuelTypeId;
    private CarBodyType carBodyType;
    private Long carBodyTypeId;
    private String price;
    private Integer weight;
    private Integer horsePower;
    private Integer seatCount;
    private Integer doorCount;
    private String description;
    private String propulsion;
    private String transmission;
    private Integer trunkWeight;

    public VehicleDTO(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Model getModel() {
        return this.model;
    }

    public Long getModelId() {
        return this.modelId;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleTypeId(Long vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public Long getVehicleTypeId() {
        return this.vehicleTypeId;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelTypeId(Long fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public Long getFuelTypeId() {
        return this.fuelTypeId;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public void setCarBodyTypeId(Long carBodyTypeId) {
        this.carBodyTypeId = carBodyTypeId;
    }

    public CarBodyType getCarBodyType() {
        return this.carBodyType;
    }

    public Long getCarBodyTypeId() {
        return this.carBodyTypeId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return this.horsePower;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Integer getSeatCount() {
        return this.seatCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public Integer getDoorCount() {
        return this.doorCount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getPropulsion() {
        return this.propulsion;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return this.transmission;
    }

    public void setTrunkWeight(Integer trunkWeight) {
        this.trunkWeight = trunkWeight;
    }

    public Integer getTrunkWeight() {
        return this.trunkWeight;
    }

}