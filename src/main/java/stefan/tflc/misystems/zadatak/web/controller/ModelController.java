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

import stefan.tflc.misystems.zadatak.service.impl.ModelServiceImpl;
import stefan.tflc.misystems.zadatak.web.dto.ModelDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/model")
public class ModelController {

    private final ModelServiceImpl modelService;

    @GetMapping
    public ResponseEntity<Set<ModelDTO>> findAll() {
         Set<ModelDTO> retVal = modelService.findAll();
         return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ModelDTO> findById(@PathVariable("id") Long id) {
        ModelDTO retVal = modelService.findById(id);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ModelDTO> create(@RequestBody ModelDTO modelDTO) {
        ModelDTO retVal = modelService.create(modelDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ModelDTO> update(@RequestBody ModelDTO modelDTO) {
        ModelDTO retVal = modelService.update(modelDTO);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") Long id) {
        modelService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}