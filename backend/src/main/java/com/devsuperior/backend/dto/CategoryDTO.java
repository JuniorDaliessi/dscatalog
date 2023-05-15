package com.devsuperior.backend.dto;

import java.io.Serializable;

import com.devsuperior.backend.entities.Category;

/**
 * Classe que representa um objeto DTO (Data Transfer Object) para a entidade Category.
 * Utilizada para transferência de dados entre a camada de serviço e a camada de controle da aplicação.
 */
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    /**
     * Identificador único da categoria.
     */
    private long id;

    /**
     * Nome da categoria.
     */
    private String name;

    //Construtores
    /**
     * Construtor padrão.
     */
    public CategoryDTO() {
    }

    /**
     * Construtor com argumentos.
     *
     * @param id o identificador único da categoria.
     * @param name o nome da categoria.
     */
    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Construtor a partir de uma entidade Category.
     *
     * @param entity a entidade Category a partir da qual será criado o objeto DTO.
     */
    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    //Getters e Setters
    /**
     * Retorna o identificador único da categoria.
     *
     * @return o identificador único da categoria.
     */
    public long getId() {
        return id;
    }

    /**
     * Define o identificador único da categoria.
     *
     * @param id o identificador único da categoria.
     */
    public void setId(long id) {
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