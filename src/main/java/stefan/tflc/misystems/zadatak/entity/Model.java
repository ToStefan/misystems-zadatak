package stefan.tflc.misystems.zadatak.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer", nullable = false)
    private Manufacturer manufacturer;

}