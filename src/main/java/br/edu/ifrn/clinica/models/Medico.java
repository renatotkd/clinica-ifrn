package br.edu.ifrn.clinica.models;

import javax.persistence.Column;

public class Medico extends Pessoa {

    @Column(unique = true)
    private String matricula;

}
