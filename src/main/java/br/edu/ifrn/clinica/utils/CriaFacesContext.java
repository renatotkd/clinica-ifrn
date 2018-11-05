/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.clinica.utils;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author joaon
 */
public class CriaFacesContext {
    
    @Produces
    @RequestScoped
    public FacesContext getFacesContext(){
        return FacesContext.getCurrentInstance();
    }
    
}
