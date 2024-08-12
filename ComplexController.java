package com.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.beans.Complex;
import com.demo.service.ComplexService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ComplexController {

    @Autowired
    private ComplexService complexService;

    @GetMapping("/getcomplexes")
    public ResponseEntity<List<Complex>> getComplexes() {
        List<Complex> complexes = complexService.findAll();
        return ResponseEntity.ok(complexes);
    }

    @GetMapping("/getcomplex/{id}")
    public ResponseEntity<Complex> getComplexById(@PathVariable int id) {
        Complex complex = complexService.findById(id);
        return complex != null ? ResponseEntity.ok(complex) : ResponseEntity.notFound().build();
    }

    @PostMapping("/addcomplex")
    public ResponseEntity<Complex> addComplex(@RequestBody Complex complex) {
        Complex savedComplex = complexService.save(complex);
        return ResponseEntity.ok(savedComplex);
    }

    @PutMapping("/updatecomplex/{id}")
    public ResponseEntity<Complex> updateComplex(@PathVariable int id, @RequestBody Complex complex) {
        if (complexService.findById(id) != null) {
            Complex updatedComplex = complexService.save(complex);
            return ResponseEntity.ok(updatedComplex);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletecomplex/{id}")
    public ResponseEntity<Void> deleteComplex(@PathVariable int id) {
        if (complexService.findById(id) != null) {
            complexService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
