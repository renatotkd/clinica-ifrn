package br.edu.ifrn.clinica.models;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historico implements Serializable {

    @Id
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Calendar dataReencaminhamento;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataReagendamento;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataPrevista;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataReencaminhamento() {
        return dataReencaminhamento;
    }

    public void setDataReencaminhamento(Calendar dataReencaminhamento) {
        this.dataReencaminhamento = dataReencaminhamento;
    }

    public Calendar getDataReagendamento() {
        return dataReagendamento;
    }

    public void setDataReagendamento(Calendar dataReagendamento) {
        this.dataReagendamento = dataReagendamento;
    }

    public Calendar getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Calendar dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
