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

import stefan.tflc.misystems.zadatak.service.impl.VehicleServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.VehicleDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/vehicle")
public class VehicleController {

    private final VehicleServiceImpl vehicleService;

    public VehicleController(VehicleServiceImpl vehicleService) {
    	this.vehicleService = vehicleService;
    }

    @GetMapping
    public ResponseEntity<Set<VehicleDTO>> findAll() {
         Set<VehicleDTO> retVal = vehicleService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<VehicleDTO>> findAllByPages(Pageable pageable) {
        PageDTO<VehicleDTO> retVal = vehicleService.findAll(pageable);
        return new ResponseEntity<PageDTO<VehicleDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<VehicleDTO> findById(@PathVariable("id") Long id) {
        VehicleDTO retVal = vehicleService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VehicleDTO> create(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO retVal = vehicleService.create(vehicleDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<VehicleDTO> update(@RequestBody VehicleDTO vehicleDTO) {
        VehicleDTO retVal = vehicleService.update(vehicleDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        vehicleService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}