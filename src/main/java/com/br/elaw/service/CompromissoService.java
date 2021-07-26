package com.br.elaw.service;

import com.br.elaw.exception.ResourceNotFoundException;
import com.br.elaw.domain.Compromisso;
import com.br.elaw.repository.CompromissoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CompromissoService {

    private final CompromissoRepository repository;

    @Autowired
    public CompromissoService(CompromissoRepository repository) {
        this.repository = repository;
    }


    public Compromisso save(Compromisso compromisso){

        return repository.save(compromisso);
    }

    public List<Compromisso> getAll(){

        return (List<Compromisso>) repository.findAll();
    }

    public List<Compromisso>findByDataCompromisso(LocalDate dataCompromisso){
        List<Compromisso>compromissos = Optional.ofNullable(
                repository.findByDataCompromisso(dataCompromisso))
                .orElseThrow(()->new ResourceNotFoundException("No data found for field " + dataCompromisso));
        return compromissos;
    }

    public Compromisso findById(Long id){
        Compromisso compromisso = repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("No data found for id " + id));
        return compromisso;
    }


    public Compromisso update(Compromisso compromisso){

        final Optional<Compromisso>compromissoUpdate = repository.findById(compromisso.getId());

        if(!compromissoUpdate.isPresent()){
            new ResourceNotFoundException("No records found this id");
        }

        return repository.save(compromisso);
    }

    public void delete(Long id){
        var entity = repository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("No data found for id " + id));
        repository.delete(entity);
    }

}
