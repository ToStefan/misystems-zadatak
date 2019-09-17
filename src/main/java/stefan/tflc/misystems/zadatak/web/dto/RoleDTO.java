package stefan.tflc.misystems.zadatak.web.dto;

public class RoleDTO {

    private Long id;
    private String name;

    public RoleDTO(){

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