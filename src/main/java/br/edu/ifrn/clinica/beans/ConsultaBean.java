package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.ConsultaDao;
import br.edu.ifrn.clinica.models.Consulta;
import br.edu.ifrn.clinica.models.Paciente;
import java.util.Optional;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Maykon Oliveira
 */
@Named
@RequestScoped
public class ConsultaBean {

    @Inject
    private ConsultaDao consultaDao;
    @Inject
    private FacesContext facesContext;
    @Inject
    private Consulta consulta;
    private String cpf = "";
    private Paciente paciente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void buscar() {
        System.out.println(cpf);
        Optional<Paciente> optional = consultaDao.buscar(cpf);
        if (optional.isPresent()) {
            paciente = optional.get();
        } else {
            facesContext.addMessage(null, new FacesMessage("Paciente não encontrado"));
            paciente = null;
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void marcarConsulta() {

    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
