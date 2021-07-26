package com.br.elaw.repository;

import com.br.elaw.domain.Compromisso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CompromissoRepository extends CrudRepository<Compromisso,Long> {

    Optional<Compromisso> findById(Long id);

    List<Compromisso>findByDataCompromisso(LocalDate dataCompromisso);

}
