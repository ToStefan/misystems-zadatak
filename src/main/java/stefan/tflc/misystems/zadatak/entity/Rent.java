package stefan.tflc.misystems.zadatak.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "rent")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_price", nullable = false)
    private Integer totalPrice;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle", nullable = false)
    private Vehicle vehicle;

    @Column(name = "rent_from", nullable = true)
    private LocalDateTime rentFrom;

    @Column(name = "rent_to", nullable = true)
    private LocalDateTime rentTo;

    public Rent(){

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getRentFrom() {
        return this.rentFrom;
    }

    public void setRentFrom(LocalDateTime rentFrom) {
        this.rentFrom = rentFrom;
    }

    public LocalDateTime getRentTo() {
        return this.rentTo;
    }

    public void setRentTo(LocalDateTime rentTo) {
        this.rentTo = rentTo;
    }

}