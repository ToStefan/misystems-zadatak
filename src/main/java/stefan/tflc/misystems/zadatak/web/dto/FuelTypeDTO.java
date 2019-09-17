package stefan.tflc.misystems.zadatak.web.dto;

public class FuelTypeDTO {

    private Long id;
    private String name;

    public FuelTypeDTO(){

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

}