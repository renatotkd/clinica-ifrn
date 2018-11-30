package br.edu.ifrn.clinica.models;

import javax.persistence.Column;

public class Medico {

    @Column(unique = true)
    private String matricula;

}
