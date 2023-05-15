package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.backend.entities.Category;

/**
 * Interface que define as operações de acesso a dados para a entidade Category.
 * Utiliza a biblioteca Spring Data JPA para implementação automática das operações.
 */
@Repository //Anotação para dizer que a interface é um repositório
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
