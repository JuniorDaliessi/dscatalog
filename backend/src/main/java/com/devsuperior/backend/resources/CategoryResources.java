package com.devsuperior.backend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.backend.entities.Category;

// O resource é o conceito e o controller REST é a implementação

@RestController //Anotação para indicar que a classe é um recurso web
@RequestMapping (value = "/categories") //Anotação para indicar o caminho do recurso
public class CategoryResources {

    //Metodos
    @RequestMapping //Anotação para indicar que o método responde a requisição do tipo GET do HTTP
    public ResponseEntity<List<Category>> findAll() {
        List <Category> list = new ArrayList <> ();
        list.add(new Category(1L, "Books"));
        list.add(new Category(2L, "Electronics"));
        return ResponseEntity.ok().body(list);
    }
}