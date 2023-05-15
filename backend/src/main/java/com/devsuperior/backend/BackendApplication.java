package com.devsuperior.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal que inicia a aplicação Spring Boot.
 */
@SpringBootApplication
public class BackendApplication {

    /**
     * Método principal que inicia a aplicação Spring Boot.
     *
     * @param args os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
