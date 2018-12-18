package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.models.Medico;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author maykon-oliveira
 */
@Transactional
public class MedicoDao implements CrudDao<Medico>{
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Medico> findAll() {
        TypedQuery<Medico> query = entityManager.createQuery("FROM Medico", Medico.class);
        return query.getResultList();
    }

    @Override
    public Optional<Medico> encontrarPeloId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medico salvar(Medico entidade) {
        entityManager.persist(entidade);
        
        return entidade;
    }

    @Override
    public Medico atualizar(Medico entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Medico entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
