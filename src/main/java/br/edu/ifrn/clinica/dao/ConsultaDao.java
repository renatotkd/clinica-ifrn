package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.exception.ConsultaNaoEncontradaException;
import br.edu.ifrn.clinica.models.Consulta;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maykon Oliveira
 */
public class ConsultaDao implements CrudDao<Consulta>{

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Optional<Consulta> encontrarPeloId(Long id) {
        Consulta consulta = entityManager.find(Consulta.class, id);
        return Optional.of(consulta);
    }

    @Override
    public Consulta salvar(Consulta entidade) {
        entityManager.persist(entidade);
        return entidade;
    }

    @Override
    public Consulta atualizar(Consulta entidade) {
        Optional<Consulta> consulta = encontrarPeloId(entidade.getId());
        if (consulta.isPresent()) {
            entityManager.merge(entidade);
        }
        return entidade;
    }

    @Override
    public void deletar(Consulta entidade) {
        Optional<Consulta> consulta = encontrarPeloId(entidade.getId());
        if (consulta.isPresent()) {
            entityManager.remove(entidade);
        }
        throw new ConsultaNaoEncontradaException();
    }
    
}
