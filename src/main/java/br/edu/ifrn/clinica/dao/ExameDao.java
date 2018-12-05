package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.models.SolicitacaoExame;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Maykon Oliveira
 */
public class ExameDao {
    
    @PersistenceContext
    private EntityManager entityManager;

    public Optional<SolicitacaoExame> findSolicitacaoExameByProtocolo(String protocolo) {
        TypedQuery<SolicitacaoExame> query = entityManager.createQuery("FROM SolicitacaoExame s WHERE s.protocolo = :p", SolicitacaoExame.class);
        query.setParameter("p", protocolo);
        
        try {
            return Optional.of(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }
    
}
