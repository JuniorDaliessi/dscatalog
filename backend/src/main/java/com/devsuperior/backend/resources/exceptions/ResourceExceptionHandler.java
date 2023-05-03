package com.devsuperior.backend.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.backend.services.exceptions.EntityNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //Anotação para indicar que a classe é responsável por tratar possíveis erros nas requisições
public class ResourceExceptionHandler {

    @ExceptionHandler (EntityNotFoundException.class) //Anotação para indicar que o método é um tratador de exceções do tipo EntityNotFoundException
    public ResponseEntity<StandardError> entityNotFound(EntityNotFoundException e, HttpServletRequest request){

        StandardError err = new StandardError(); 

        err.setTimestamp(Instant.now()); 
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
    
}
