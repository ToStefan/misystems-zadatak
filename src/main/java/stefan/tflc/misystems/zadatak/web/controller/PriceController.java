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

import stefan.tflc.misystems.zadatak.service.impl.PriceServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.PriceDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/price")
public class PriceController {

    private final PriceServiceImpl priceService;

    @GetMapping
    public ResponseEntity<Set<PriceDTO>> findAll() {
         Set<PriceDTO> retVal = priceService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PriceDTO> findById(@PathVariable("id") Long id) {
        PriceDTO retVal = priceService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PriceDTO> create(@RequestBody PriceDTO priceDTO) {
        PriceDTO retVal = priceService.create(priceDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PriceDTO> update(@RequestBody PriceDTO priceDTO) {
        PriceDTO retVal = priceService.update(priceDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        priceService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}