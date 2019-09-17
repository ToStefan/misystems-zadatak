package stefan.tflc.misystems.zadatak.entity;

import javax.persistence.*;

@Entity
@Table(name = "carbodytype")
public class CarBodyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public CarBodyType(){

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}