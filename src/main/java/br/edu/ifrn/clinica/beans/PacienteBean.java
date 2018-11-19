package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.PacienteDao;
import br.edu.ifrn.clinica.models.Paciente;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Maykon Oliveira
 */
@Named
@RequestScoped
public class PacienteBean {
    
    @Inject
    private PacienteDao pacienteDao;
    @Inject
    private Paciente paciente;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
