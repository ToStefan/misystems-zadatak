package stefan.tflc.misystems.zadatak.entity;

import lombok.Data;

import javax.persistence.*;

@Data
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

}