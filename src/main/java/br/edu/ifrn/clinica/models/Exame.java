package br.edu.ifrn.clinica.models;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String protocolo;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataRecebimento;
    @ManyToOne
    private Paciente paciente;
    private Boolean arquivado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Calendar getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Calendar dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Boolean getArquivado() {
        return arquivado;
    }

    public void setArquivado(Boolean arquivado) {
        this.arquivado = arquivado;
    }
    
}
