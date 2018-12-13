/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.clinica.models;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author leandro
 */
@Entity
class Permissao {

    @Id
    private String userLevel;

    public Permissao(String userLevel) {
        this.userLevel = userLevel;
    }

    @Deprecated
    public Permissao() {
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

}
