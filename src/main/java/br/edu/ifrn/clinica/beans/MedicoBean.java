package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.MedicoDao;
import br.edu.ifrn.clinica.models.Medico;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maykon-oliveira
 */
@Named
@RequestScoped
public class MedicoBean {
    
    @Inject
    private MedicoDao medicoDao;
    @Inject
    private Medico medico;
    @Inject
    private FacesContext facesContext;

    public List<Medico> listarMedicos() {
        return medicoDao.findAll();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void save(){
        String mensagem = "";
        medicoDao.salvar(medico);
        mensagem = "Medico cadastrado com sucesso!";
        medico = new Medico();
        medico = null;
        facesContext.addMessage(null, new FacesMessage(mensagem));
    }
    
}
