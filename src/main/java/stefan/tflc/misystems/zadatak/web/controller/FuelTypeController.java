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

import stefan.tflc.misystems.zadatak.service.impl.FuelTypeServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.FuelTypeDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/fueltype")
public class FuelTypeController {

    private final FuelTypeServiceImpl fueltypeService;

    public FuelTypeController(FuelTypeServiceImpl fueltypeService) {
    	this.fueltypeService = fueltypeService;
    }

    @GetMapping
    public ResponseEntity<Set<FuelTypeDTO>> findAll() {
         Set<FuelTypeDTO> retVal = fueltypeService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<FuelTypeDTO>> findAllByPages(Pageable pageable) {
        PageDTO<FuelTypeDTO> retVal = fueltypeService.findAll(pageable);
        return new ResponseEntity<PageDTO<FuelTypeDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuelTypeDTO> findById(@PathVariable("id") Long id) {
        FuelTypeDTO retVal = fueltypeService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FuelTypeDTO> create(@RequestBody FuelTypeDTO fueltypeDTO) {
        FuelTypeDTO retVal = fueltypeService.create(fueltypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<FuelTypeDTO> update(@RequestBody FuelTypeDTO fueltypeDTO) {
        FuelTypeDTO retVal = fueltypeService.update(fueltypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        fueltypeService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}