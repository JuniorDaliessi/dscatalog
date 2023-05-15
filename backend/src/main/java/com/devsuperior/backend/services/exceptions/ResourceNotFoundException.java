package com.devsuperior.backend.services.exceptions;

/**
 * Classe que representa uma exceção personalizada para indicar que um recurso não foi encontrado.
 * Estende a classe RuntimeException para indicar que é uma exceção não verificada.
 */
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    /**
     * Construtor que recebe uma mensagem de erro.
     *
     * @param msg a mensagem de erro a ser exibida.
     */
    public ResourceNotFoundException(String msg){
        super(msg); // repassa a mensagem para a superclasse
    }
}
