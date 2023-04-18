package com.devsuperior.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.backend.entities.Category;
import com.devsuperior.backend.repositories.CategoryRepository;

// Camada de serviço (Service)

@Service //Anotação para indicar que a classe é um componente do Spring que vai ser injetado automaticamente
public class CategoryService {

    @Autowired //Anotação para indicar que a dependência vai ser injetada automaticamente pelo Spring
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }
    
}
