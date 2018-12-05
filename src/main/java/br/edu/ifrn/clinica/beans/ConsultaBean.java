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
    private ConsultaDao consultaDao;
    @Inject
    private Consulta consulta;

    public void marcarConsulta() {

    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
