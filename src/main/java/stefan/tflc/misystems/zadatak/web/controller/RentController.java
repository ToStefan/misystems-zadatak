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

import stefan.tflc.misystems.zadatak.service.impl.RentServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.RentDTO;

import stefan.tflc.misystems.zadatak.web.dto.PageDTO;
import org.springframework.data.domain.Pageable;
@RestController
@RequestMapping(value = "/api/rent")
public class RentController {

    private final RentServiceImpl rentService;

    public RentController(RentServiceImpl rentService) {
    	this.rentService = rentService;
    }

    @GetMapping
    public ResponseEntity<Set<RentDTO>> findAll() {
         Set<RentDTO> retVal = rentService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/pages")
    public ResponseEntity<PageDTO<RentDTO>> findAllByPages(Pageable pageable) {
        PageDTO<RentDTO> retVal = rentService.findAll(pageable);
        return new ResponseEntity<PageDTO<RentDTO>>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<RentDTO> findById(@PathVariable("id") Long id) {
        RentDTO retVal = rentService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RentDTO> create(@RequestBody RentDTO rentDTO) {
        RentDTO retVal = rentService.create(rentDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<RentDTO> update(@RequestBody RentDTO rentDTO) {
        RentDTO retVal = rentService.update(rentDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        rentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}