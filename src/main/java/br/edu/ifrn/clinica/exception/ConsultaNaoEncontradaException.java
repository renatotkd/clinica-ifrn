package br.edu.ifrn.clinica.exception;

/**
 *
 * @author Maykon Oliveira
 */
public class ConsultaNaoEncontradaException extends RuntimeException {

    public ConsultaNaoEncontradaException() {
        super("Consulta não encontrada");
    }
    
}
