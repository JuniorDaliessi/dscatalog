package com.devsuperior.backend.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.backend.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //Anotação para indicar que a classe é responsável por tratar possíveis erros nas requisições
public class ResourceExceptionHandler {

    @ExceptionHandler (ResourceNotFoundException.class) //Anotação para indicar que o método é um tratador de exceções do tipo EntityNotFoundException
    public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request){

        StandardError err = new StandardError(); 

        err.setTimestamp(Instant.now()); //Pega o instante atual do sistema
        err.setStatus(HttpStatus.NOT_FOUND.value()); //Código HTTP 404
        err.setError("Resource not found"); //Mensagem de erro
        err.setMessage(e.getMessage()); //Mensagem da exceção
        err.setPath(request.getRequestURI()); //Pega o caminho da requisição
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err); //Retorna a resposta com o código HTTP 404 e o corpo com o objeto err
    }
    
}
