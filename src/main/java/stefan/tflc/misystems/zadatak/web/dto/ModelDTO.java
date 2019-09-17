package stefan.tflc.misystems.zadatak.web.dto;

import stefan.tflc.misystems.zadatak.entity.Manufacturer;

public class ModelDTO {

    private Long id;
    private String name;
    private Manufacturer manufacturer;
    private Long manufacturerId;

    public ModelDTO(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public Long getManufacturerId() {
        return this.manufacturerId;
    }

}