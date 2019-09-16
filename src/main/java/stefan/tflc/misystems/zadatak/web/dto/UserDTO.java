package stefan.tflc.misystems.zadatak.web.dto;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stefan.tflc.misystems.zadatak.entity.Role;

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

}