package com.devsuperior.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.backend.dto.CategoryDTO;
import com.devsuperior.backend.entities.Category;
import com.devsuperior.backend.repositories.CategoryRepository;

// Camada de serviço (Service)

@Service //Anotação para indicar que a classe é um componente do Spring que vai ser injetado automaticamente
public class CategoryService {

    @Autowired //Anotação para indicar que a dependência vai ser injetada automaticamente pelo Spring
    private CategoryRepository repository;

    @Transactional(readOnly = true) //Anotação para indicar que o método é transacional e que a operação é somente leitura
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        
        //Expressão lambda para converter uma lista de Category para uma lista de CategoryDTO
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());

//Código comentado para substituir por uma expressão lambda
       /*  List<CategoryDTO> listDto = new ArrayList<>();
        for (Category cat : list) {
            listDto.add(new CategoryDTO(cat));
        }*/ 
        //return listDto;
    }
    
}
