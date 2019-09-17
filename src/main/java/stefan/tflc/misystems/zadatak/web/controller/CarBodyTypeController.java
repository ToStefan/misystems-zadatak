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

import stefan.tflc.misystems.zadatak.service.impl.CarBodyTypeServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.CarBodyTypeDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/carbodytype")
public class CarBodyTypeController {

    private final CarBodyTypeServiceImpl carbodytypeService;

    public CarBodyTypeController(CarBodyTypeServiceImpl carbodytypeService) {
    	this.carbodytypeService = carbodytypeService;
    }

    @GetMapping
    public ResponseEntity<Set<CarBodyTypeDTO>> findAll() {
         Set<CarBodyTypeDTO> retVal = carbodytypeService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<CarBodyTypeDTO>> findAllByPages(Pageable pageable) {
        PageDTO<CarBodyTypeDTO> retVal = carbodytypeService.findAll(pageable);
        return new ResponseEntity<PageDTO<CarBodyTypeDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CarBodyTypeDTO> findById(@PathVariable("id") Long id) {
        CarBodyTypeDTO retVal = carbodytypeService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CarBodyTypeDTO> create(@RequestBody CarBodyTypeDTO carbodytypeDTO) {
        CarBodyTypeDTO retVal = carbodytypeService.create(carbodytypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<CarBodyTypeDTO> update(@RequestBody CarBodyTypeDTO carbodytypeDTO) {
        CarBodyTypeDTO retVal = carbodytypeService.update(carbodytypeDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        carbodytypeService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}