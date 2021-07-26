package com.br.elaw.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TB_COMPROMISSO")
public class Compromisso implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "tp_compromisso",length = 255)
    private String tipoCompromisso;

    @NotNull
    @Column(name = "dt_compromisso")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCompromisso;


    @Column(name = "ds_observaoces",length = 255,nullable = true)
    private String observacoes;


    public Compromisso() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCompromisso() {
        return tipoCompromisso;
    }

    public void setTipoCompromisso(String tipoCompromisso) {
        this.tipoCompromisso = tipoCompromisso;
    }

    public LocalDate getDataCompromisso() {
        return dataCompromisso;
    }

    public void setDataCompromisso(LocalDate dataCompromisso) {
        this.dataCompromisso = dataCompromisso;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compromisso)) return false;
        Compromisso that = (Compromisso) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
