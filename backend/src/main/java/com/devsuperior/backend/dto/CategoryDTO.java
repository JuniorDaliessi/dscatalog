package com.devsuperior.backend.dto;

import java.io.Serializable;

import com.devsuperior.backend.entities.Category;

public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    //Atributos
    private long id;
    private String name;

    //Construtores
    public CategoryDTO() {
    }

    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getters e Setters
    

    
}