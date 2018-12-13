package br.edu.ifrn.clinica.dao;

import br.edu.ifrn.clinica.exception.ConsultaNaoEncontradaException;
import br.edu.ifrn.clinica.models.Consulta;
import br.edu.ifrn.clinica.models.Paciente;
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
public class ConsultaDao implements CrudDao<Consulta> {

    @PersistenceContext
    private EntityManager entityManager;
    private Paciente paciente;

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

    public void deletar(Consulta entidade) {
        entityManager.remove(entityManager.find(Consulta.class, entidade.getId()));
    }

    public Optional<Paciente> buscar(String cpf) {
        TypedQuery<Paciente> query = entityManager.createQuery("FROM Paciente p WHERE p.cpf = :cpf", Paciente.class);
        query.setParameter("cpf", cpf);

        try {
            return Optional.of(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

}
