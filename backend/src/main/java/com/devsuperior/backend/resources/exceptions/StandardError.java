package com.devsuperior.backend.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

/**
 * Classe que representa um objeto de erro padrão para ser retornado em respostas HTTP.
 * Implementa a interface Serializable para permitir a serialização do objeto.
 */
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;
    
     private Instant timestamp;
     private Integer status;
     private String error;
     private String message;
     private String path;

     /**
      * Construtor padrão sem argumentos.
      */
     public StandardError() {
     }

    /**
     * Retorna o instante em que o erro ocorreu.
     *
     * @return o instante em que o erro ocorreu.
     */
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * Define o instante em que o erro ocorreu.
     *
     * @param timestamp o instante em que o erro ocorreu.
     */
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Retorna o código HTTP do erro.
     *
     * @return o código HTTP do erro.
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Define o código HTTP do erro.
     *
     * @param status o código HTTP do erro.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Retorna a mensagem de erro.
     *
     * @return a mensagem de erro.
     */
    public String getError() {
        return error;
    }

    /**
     * Define a mensagem de erro.
     *
     * @param error a mensagem de erro.
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * Retorna a mensagem detalhada do erro.
     *
     * @return a mensagem detalhada do erro.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define a mensagem detalhada do erro.
     *
     * @param message a mensagem detalhada do erro.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Retorna o caminho da requisição que gerou o erro.
     *
     * @return o caminho da requisição que gerou o erro.
     */
    public String getPath() {
        return path;
    }

    /**
     * Define o caminho da requisição que gerou o erro.
     *
     * @param path o caminho da requisição que gerou o erro.
     */
    public void setPath(String path) {
        this.path = path;
    }

     
}