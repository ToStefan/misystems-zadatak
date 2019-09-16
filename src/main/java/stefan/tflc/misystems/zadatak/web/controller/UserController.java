package stefan.tflc.misystems.zadatak.web.controller;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stefan.tflc.misystems.zadatak.service.impl.UserServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.UserDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    private final UserServiceImpl userService;

    @GetMapping
    public ResponseEntity<Set<UserDTO>> findAll() {
         Set<UserDTO> retVal = userService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable("id") Long id) {
        UserDTO retVal = userService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) {
        UserDTO retVal = userService.create(userDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO userDTO) {
        UserDTO retVal = userService.update(userDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        userService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}