package stefan.tflc.misystems.zadatak.web.dto;

import stefan.tflc.misystems.zadatak.entity.User;

import stefan.tflc.misystems.zadatak.entity.Vehicle;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class RentDTO {

    private Long id;
    private Integer totalPrice;
    private User user;
    private Long userId;
    private Vehicle vehicle;
    private Long vehicleId;
    private LocalDateTime rentFrom;
    private LocalDateTime rentTo;

    public RentDTO(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return this.user;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public Long getVehicleId() {
        return this.vehicleId;
    }

    public void setRentFrom(LocalDateTime rentFrom) {
        this.rentFrom = rentFrom;
    }

    public LocalDateTime getRentFrom() {
        return this.rentFrom;
    }

    public void setRentTo(LocalDateTime rentTo) {
        this.rentTo = rentTo;
    }

    public LocalDateTime getRentTo() {
        return this.rentTo;
    }

}