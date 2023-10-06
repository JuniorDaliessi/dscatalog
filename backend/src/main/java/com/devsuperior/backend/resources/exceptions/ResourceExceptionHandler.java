package com.devsuperior.backend.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.backend.services.exceptions.DatabaseExeption;
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
        HttpStatus status = HttpStatus.NOT_FOUND; //Código HTTP 404
        StandardError err = new StandardError(); 
        err.setTimestamp(Instant.now()); //Pega o instante atual do sistema
        err.setStatus(status.value()); //Código HTTP 404
        err.setError("Recurso não encontrado"); //Mensagem de erro
        err.setMessage(e.getMessage()); //Mensagem da exceção vinda da classe ResourceNotFoundException no pacote services.exceptions
        err.setPath(request.getRequestURI()); //Pega o caminho da requisição no objeto request
        return ResponseEntity.status(status).body(err); //Retorna a resposta com o código HTTP 404 e o corpo com o objeto err
    }

    /**
    * Método responsável por tratar exceções do tipo DatabaseExeption, que é lançada quando ocorre um erro no banco de dados.
    *
    * @param e Exceção do tipo DatabaseExeption lançada.
    * @param request Objeto HttpServletRequest que contém informações sobre a requisição que causou o erro.
    * @return ResponseEntity com o status HTTP 400 (bad request) e um objeto StandardError no corpo da resposta.
    */
    @ExceptionHandler(DatabaseExeption.class)
    public ResponseEntity<StandardError> database(DatabaseExeption e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST; //Código HTTP 400
        StandardError err = new StandardError(); 
        err.setTimestamp(Instant.now()); //Pega o instante atual do sistema
        err.setStatus(status.value()); //Código HTTP 400
        err.setError("Exceção no banco de dados"); //Mensagem de erro
        err.setMessage(e.getMessage()); //Mensagem da exceção
        err.setPath(request.getRequestURI()); //Pega o caminho da requisição
        return ResponseEntity.status(status).body(err); //Retorna a resposta com o código HTTP 400 e o corpo com o objeto err
    }
}
