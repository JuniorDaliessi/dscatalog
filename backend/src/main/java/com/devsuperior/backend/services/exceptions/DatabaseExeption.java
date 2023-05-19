package com.devsuperior.backend.services.exceptions;

public class DatabaseExeption extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * Construtor da classe DatabaseExeption.
     *
     * @param msg Mensagem de erro da exceção.
     */
    public DatabaseExeption(String msg) {
        super(msg);
    }
}
