package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.models.Paciente;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class PacienteDao implements CrudDao<Paciente>{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Paciente> encontrarPeloId(Long id) {
        Paciente paciente = entityManager.find(Paciente.class, id);
        return Optional.ofNullable(paciente);
    }

    @Override
    public Paciente salvar(Paciente entidade) {
        entityManager.persist(entidade);
        
        return entidade;
    }

    @Override
    public Paciente atualizar(Paciente entidade) {
        Optional<Paciente> paciente = encontrarPeloId(entidade.getId());
        if (paciente.isPresent()) {
            entityManager.merge(entidade);
        }
        return entidade;
    }

    @Override
    
    public void deletar(Paciente entidade) {
   
        entityManager.remove(entityManager.find(Paciente.class, entidade.getId()));
    }
    public List<Paciente> listar(){
        String jpql = "select distinct(l) from Paciente l";
        return entityManager.createQuery(jpql, Paciente.class).getResultList();
    }
    
}
