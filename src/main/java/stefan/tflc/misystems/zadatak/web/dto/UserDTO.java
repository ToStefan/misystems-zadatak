package stefan.tflc.misystems.zadatak.web.dto;

import java.time.LocalDateTime;

import java.util.List;

import stefan.tflc.misystems.zadatak.entity.Role;
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private LocalDateTime bornDate;
    private Boolean active;
    private List<Role> roles;

    public UserDTO(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setBornDate(LocalDateTime bornDate) {
        this.bornDate = bornDate;
    }

    public LocalDateTime getBornDate() {
        return this.bornDate;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return this.roles;
    }

}