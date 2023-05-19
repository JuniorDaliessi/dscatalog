package com.devsuperior.backend.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
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

    /**
     * Data de criação da categoria.
     */
    @Column (columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //Anotação para dizer que o atributo é uma coluna do banco de dados
    private Instant createdAt;

    /**
     * Data de atualização da categoria.
     */
    @Column (columnDefinition = "TIMESTAMP WITHOUT TIME ZONE") //Anotação para dizer que o atributo é uma coluna do banco de dados
    private Instant updatedAt;

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

    /**
     * Retorna a data de criação da categoria.
     *
     * @return a data de criação da categoria.
     */
    public Instant getCreatedAt() {
        return createdAt;
    }

    /**
     * Define a data de criação da categoria.
     *
     * @param createdAt a data de criação da categoria.
     */
    @PrePersist //Anotação para dizer que o método deve ser executado antes de persistir os dados no banco de dados
    public void prePersist() {
        createdAt = Instant.now();
    }

    /**
     * Retorna a data de atualização da categoria.
     *
     * @return a data de atualização da categoria.
     */
    public Instant getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Define a data de atualização da categoria.
     *
     * @param updatedAt a data de atualização da categoria.
     */
    @PreUpdate //Anotação para dizer que o método deve ser executado antes de atualizar os dados no banco de dados
    public void preUpdate() {
        updatedAt = Instant.now();
    }

    
}