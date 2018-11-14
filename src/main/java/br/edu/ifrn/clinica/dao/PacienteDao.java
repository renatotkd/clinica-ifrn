package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.models.Paciente;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maykon Oliveira
 */
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
        entityManager.refresh(entidade);
        return entidade;
    }

    @Override
    public Paciente atualizar(Paciente entidade) {
        entityManager.persist(entidade);
        return entidade;
    }

    @Override
    public void deletar(Paciente entidade) {
        entityManager.remove(entidade);
    }
    
}
