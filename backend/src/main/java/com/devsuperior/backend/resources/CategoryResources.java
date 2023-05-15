package com.devsuperior.backend.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devsuperior.backend.dto.CategoryDTO;
import com.devsuperior.backend.services.CategoryService;

//Controlodor REST
// O resource é o conceito e o controller REST é a implementação


/**
 * Classe que implementa as rotas REST para manipulação de dados referentes às categorias de um aplicativo.
 * Utiliza a biblioteca Spring Framework para gerenciamento de requisições HTTP.
 */
@RestController 
@RequestMapping (value = "/categories") 
public class CategoryResources {

    //Metodos
    @Autowired
    private CategoryService service;

    /**
     * Retorna uma lista de todas as categorias cadastradas no sistema.
     *
     * @return ResponseEntity com a lista de objetos CategoryDTO no corpo da resposta.
     */
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll() {
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    /**
     * Retorna a categoria correspondente ao id informado.
     *
     * @param id o id da categoria a ser buscada.
     * @return ResponseEntity com o objeto CategoryDTO correspondente no corpo da resposta.
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {

        //Poderiamos usar um try catch para tratar a exceção, mas vamos usar o ControllerAdvice (ExceptionHandler)
        /*try {
            CategoryDTO dto = service.findById(id);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return ResponseEntity.ok().body(dto);*/
        CategoryDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    /**
     * Insere uma nova categoria no sistema.
     *
     * @param dto o objeto CategoryDTO contendo os dados da categoria a ser inserida.
     * @return ResponseEntity com o objeto CategoryDTO inserido no corpo da resposta e um header Location com a URL para acessar o objeto inserido.
     */
    @PostMapping
    public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    /**
     * Atualiza a categoria correspondente ao id informado com os dados contidos no CategoryDTO informado.
     *
     * @param id o id da categoria a ser atualizada.
     * @param dto o objeto CategoryDTO contendo os novos dados da categoria.
     * @return ResponseEntity com o objeto CategoryDTO atualizado no corpo da resposta.
     */
    @PutMapping(value = "/{id}") //Anotação para indicar que o método responde a requisição do tipo PUT do HTTP
    public ResponseEntity<CategoryDTO> update(@PathVariable Long id, @RequestBody CategoryDTO dto) {
        dto = service.update(id, dto);
        return ResponseEntity.ok().body(dto);
    }
    
}