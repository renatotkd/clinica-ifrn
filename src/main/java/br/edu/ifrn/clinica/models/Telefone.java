package br.edu.ifrn.clinica.models;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Telefone implements Serializable {

    @Id
    private Integer id;
    private String numero;
    private Boolean isWhats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getIsWhats() {
        return isWhats;
    }

    public void setIsWhats(Boolean isWhats) {
        this.isWhats = isWhats;
    }

}
