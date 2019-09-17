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

import stefan.tflc.misystems.zadatak.service.impl.RoleServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.RoleDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/role")
public class RoleController {

    private final RoleServiceImpl roleService;

    public RoleController(RoleServiceImpl roleService) {
    	this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<Set<RoleDTO>> findAll() {
         Set<RoleDTO> retVal = roleService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<RoleDTO>> findAllByPages(Pageable pageable) {
        PageDTO<RoleDTO> retVal = roleService.findAll(pageable);
        return new ResponseEntity<PageDTO<RoleDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RoleDTO> findById(@PathVariable("id") Long id) {
        RoleDTO retVal = roleService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RoleDTO> create(@RequestBody RoleDTO roleDTO) {
        RoleDTO retVal = roleService.create(roleDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<RoleDTO> update(@RequestBody RoleDTO roleDTO) {
        RoleDTO retVal = roleService.update(roleDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        roleService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}