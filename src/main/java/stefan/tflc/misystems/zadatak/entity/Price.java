package stefan.tflc.misystems.zadatak.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private Integer price;

    @OneToOne(targetEntity = Vehicle.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "vehicle", nullable = false)
    private Vehicle vehicle;

}