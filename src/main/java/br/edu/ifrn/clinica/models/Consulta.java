package br.edu.ifrn.clinica.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAtendimento;
    @ManyToOne
    private Medico medico;
    @ManyToOne
    private Paciente paciente;
    private BigDecimal valor;
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<SolicitacaoExame> examesSolicitados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Calendar getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Calendar dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<SolicitacaoExame> getExamesSolicitados() {
        return examesSolicitados;
    }

    public void setExamesSolicitados(List<SolicitacaoExame> examesSolicitados) {
        this.examesSolicitados = examesSolicitados;
    }

}
