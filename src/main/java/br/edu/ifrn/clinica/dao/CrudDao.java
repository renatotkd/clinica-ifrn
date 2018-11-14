package br.edu.ifrn.clinica.dao;

import java.util.Optional;

/**
 * Metodos básicos para um CRUD
 * 
 * @author 20171148060009
 */
public interface CrudDao<T> {
    
    Optional<T> encontrarPeloId(Long id);
    
    T salvar(T entidade);
    
    T atualizar(T entidade);
    
    void deletar(T entidade);
}
