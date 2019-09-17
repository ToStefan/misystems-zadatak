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

import stefan.tflc.misystems.zadatak.service.impl.VehicleTypeServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.VehicleTypeDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/vehicletype")
public class VehicleTypeController {

    private final VehicleTypeServiceImpl vehicletypeService;

    public VehicleTypeController(VehicleTypeServiceImpl vehicletypeService) {
    	this.vehicletypeService = vehicletypeService;
    }

    @GetMapping
    public ResponseEntity<Set<VehicleTypeDTO>> findAll() {
         Set<VehicleTypeDTO> retVal = vehicletypeService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<VehicleTypeDTO>> findAllByPages(Pageable pageable) {
        PageDTO<VehicleTypeDTO> retVal = vehicletypeService.findAll(pageable);
        return new ResponseEntity<PageDTO<VehicleTypeDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<VehicleTypeDTO> findById(@PathVariable("id") Long id) {
        VehicleTypeDTO retVal = vehicletypeService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VehicleTypeDTO> create(@RequestBody VehicleTypeDTO vehicletypeDTO) {
        VehicleTypeDTO retVal = vehicletypeService.create(vehicletypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<VehicleTypeDTO> update(@RequestBody VehicleTypeDTO vehicletypeDTO) {
        VehicleTypeDTO retVal = vehicletypeService.update(vehicletypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        vehicletypeService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}