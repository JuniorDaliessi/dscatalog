package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.backend.entities.Category;

// Camada de aceso a dados (Repository)

@Repository //Anotação para indicar que a classe é um componente do Spring que vai ser injetado automaticamente
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
