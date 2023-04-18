package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.backend.entities.Category;

// JpaRepository<Category, Long> -> Category é a entidade e Long é o tipo do ID
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
