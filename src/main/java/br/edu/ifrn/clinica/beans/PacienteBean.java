package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.PacienteDao;
import br.edu.ifrn.clinica.models.Paciente;
import java.util.List;
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

    private List<Paciente> pacientes;

    
    
    
    public PacienteDao getPacienteDao() {
        return pacienteDao;
    }

    public void setPacienteDao(PacienteDao pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    
    public List<Paciente> listar(){
        if (pacientes == null){
            pacientes = pacienteDao.listar();
        }
        return pacientes;
    }
    
    public void salvar(){
        pacienteDao.salvar(paciente);
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
