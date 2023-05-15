package com.devsuperior.backend.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.backend.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Classe que implementa um tratador de exceções para as rotas REST do aplicativo.
 * Utiliza a biblioteca Spring Framework para gerenciamento de exceções.
 */
@ControllerAdvice //Anotação para dizer que a classe é um tratador de exceções
public class ResourceExceptionHandler {

    /**
     * Trata a exceção ResourceNotFoundException.
     *
     * @param e a exceção ResourceNotFoundException a ser tratada.
     * @param request o objeto HttpServletRequest da requisição que gerou a exceção.
     * @return ResponseEntity com um objeto StandardError no corpo da resposta e o status HTTP 404 NOT FOUND.
     */
    @ExceptionHandler(ResourceNotFoundException.class) //Anotação para definir qual exceção esse método trata
    public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        StandardError err = new StandardError(); 
        err.setTimestamp(Instant.now()); //Pega o instante atual do sistema
        err.setStatus(HttpStatus.NOT_FOUND.value()); //Código HTTP 404
        err.setError("Recurso não encontrado"); //Mensagem de erro
        err.setMessage(e.getMessage()); //Mensagem da exceção
        err.setPath(request.getRequestURI()); //Pega o caminho da requisição
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err); //Retorna a resposta com o código HTTP 404 e o corpo com o objeto err
    }
}
