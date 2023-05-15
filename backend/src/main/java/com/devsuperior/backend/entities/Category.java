package com.devsuperior.backend.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe que representa a entidade Category no banco de dados.
 */
@Entity //Anotação para dizer que a classe é uma entidade
@Table (name = "tb_category") //Anotação para dizer que a classe é uma tabela
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //Atributos
    /**
     * Identificador único da categoria.
     */
    @Id //Anotação para dizer que o atributo é uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Anotação para dizer que o atributo é auto incrementado (gerado automaticamente)
    private Long id;

    /**
     * Nome da categoria.
     */
    private String name;

    //Construtores
    /**
     * Construtor padrão.
     */
    public Category() {
    }

    /**
     * Construtor com argumentos.
     *
     * @param id o identificador único da categoria.
     * @param name o nome da categoria.
     */
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters e Setters
    /**
     * Retorna o identificador único da categoria.
     *
     * @return o identificador único da categoria.
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o identificador único da categoria.
     *
     * @param id o identificador único da categoria.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retorna o nome da categoria.
     *
     * @return o nome da categoria.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da categoria.
     *
     * @param name o nome da categoria.
     */
    public void setName(String name) {
        this.name = name;
    }
}