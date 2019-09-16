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

import stefan.tflc.misystems.zadatak.service.impl.ManufacturerServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.ManufacturerDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/manufacturer")
public class ManufacturerController {

    private final ManufacturerServiceImpl manufacturerService;

    @GetMapping
    public ResponseEntity<Set<ManufacturerDTO>> findAll() {
         Set<ManufacturerDTO> retVal = manufacturerService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ManufacturerDTO> findById(@PathVariable("id") Long id) {
        ManufacturerDTO retVal = manufacturerService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ManufacturerDTO> create(@RequestBody ManufacturerDTO manufacturerDTO) {
        ManufacturerDTO retVal = manufacturerService.create(manufacturerDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ManufacturerDTO> update(@RequestBody ManufacturerDTO manufacturerDTO) {
        ManufacturerDTO retVal = manufacturerService.update(manufacturerDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        manufacturerService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}