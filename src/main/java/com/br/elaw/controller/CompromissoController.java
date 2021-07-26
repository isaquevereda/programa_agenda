package com.br.elaw.controller;


import com.br.elaw.domain.Compromisso;
import com.br.elaw.service.CompromissoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/compromisso")
public class CompromissoController {

    private final CompromissoService service;


    @Autowired
    public CompromissoController(CompromissoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Compromisso> save(@Valid @RequestBody Compromisso compromisso) {
        var entity = service.save(compromisso);
        return new ResponseEntity<Compromisso>(entity,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Compromisso>> getAll() {

        List<Compromisso>compromissos = service.getAll();

        return new ResponseEntity<List<Compromisso>>(compromissos,HttpStatus.OK);

    }

    @GetMapping("/buscarPorData")
    public ResponseEntity<List<Compromisso>>findByDataCompromisso(@RequestParam("dataCompromisso")LocalDate dataCompromisso){
        List<Compromisso> compromissos = service.findByDataCompromisso(dataCompromisso);

        return new ResponseEntity<List<Compromisso>>(compromissos,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compromisso>findById(@PathVariable("id")Long id){
        var compromisso = service.findById(id);
        return new ResponseEntity<Compromisso>(compromisso,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Compromisso> update(@RequestBody Compromisso compromisso){

        Compromisso comp = service.update(compromisso);

        return new ResponseEntity<Compromisso>(comp,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable("id")Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
