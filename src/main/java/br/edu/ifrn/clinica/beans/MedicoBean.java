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

    public List<Medico> listarMedicos() {
        return medicoDao.findAll();
    }

}
