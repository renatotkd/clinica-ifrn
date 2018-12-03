package br.edu.ifrn.clinica.beans;

import br.edu.ifrn.clinica.dao.ExameDao;
import br.edu.ifrn.clinica.models.SolicitacaoExame;
import java.util.Optional;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Maykon Oliveira
 */
@Named
public class ExameBean {

    @Inject
    private ExameDao exameDao;
    @Inject
    private FacesContext facesContext;
    private String protocolo;
    private SolicitacaoExame solicitacaoExame;
    private Boolean bool = true;

    public void pesquisarExame() {
        Optional<SolicitacaoExame> optional = exameDao.findSolicitacaoExameByProtocolo(protocolo);
        if (optional.isPresent()) {
            solicitacaoExame = optional.get();
        } else {
            facesContext.addMessage(null, new FacesMessage("Exame não solicitado"));
//            solicitacaoExame = null;
        }
    }

    public void receberExame() {
        bool = false;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public SolicitacaoExame getSolicitacaoExame() {
        return solicitacaoExame;
    }

    public void setSolicitacaoExame(SolicitacaoExame solicitacaoExame) {
        this.solicitacaoExame = solicitacaoExame;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

}
