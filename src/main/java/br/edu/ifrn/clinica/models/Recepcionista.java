package br.edu.ifrn.clinica.models;

import javax.persistence.Column;

public class Recepcionista {

    @Column(unique = true)
    private String matricula;

}
