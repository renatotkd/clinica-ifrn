package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.ConsultaDao;
import br.edu.ifrn.clinica.models.Consulta;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Maykon Oliveira
 */

@Named
public class ConsultaBean {
    
    @Inject
    ConsultaDao consultaDao;
    @Inject
    Consulta consulta;

    public void consulta(){
        
    }
}
