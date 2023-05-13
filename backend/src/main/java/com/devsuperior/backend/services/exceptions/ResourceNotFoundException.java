package com.devsuperior.backend.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public ResourceNotFoundException(String msg){
        super(msg); // repassa a mensagem para a superclasse
    }
}
