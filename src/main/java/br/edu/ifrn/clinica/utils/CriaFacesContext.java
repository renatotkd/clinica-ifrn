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
