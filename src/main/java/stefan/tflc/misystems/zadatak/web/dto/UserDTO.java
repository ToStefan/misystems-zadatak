package stefan.tflc.misystems.zadatak.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stefan.tflc.misystems.zadatak.entity.Rent;
import stefan.tflc.misystems.zadatak.entity.Role;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String firstname;
    private Date bornDate;
    private Boolean active;
    private List<Role> roles;
    private Set<Rent> rent;

}