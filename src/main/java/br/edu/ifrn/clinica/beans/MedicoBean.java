package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.MedicoDao;
import br.edu.ifrn.clinica.models.Medico;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author maykon-oliveira
 */
@Named
public class MedicoBean {
    
    @Inject
    private MedicoDao medicoDao;
    @Inject
    private Medico medico;

    public List<Medico> listarMedicos() {
        return medicoDao.findAll();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
}
