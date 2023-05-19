package com.devsuperior.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.backend.dto.CategoryDTO;
import com.devsuperior.backend.entities.Category;
import com.devsuperior.backend.repositories.CategoryRepository;
import com.devsuperior.backend.services.exceptions.DatabaseExeption;
import com.devsuperior.backend.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

/**
 * Classe que implementa a camada de serviço para a entidade Category.
 * Utiliza a biblioteca Spring Framework para injeção de dependências e gerenciamento de transações.
 */
@Service //Anotação para indicar que a classe é um componente do Spring que vai ser injetado automaticamente
public class CategoryService {

    @Autowired //Anotação para indicar que a dependência vai ser injetada automaticamente pelo Spring
    private CategoryRepository repository;

    /**
     * Retorna uma lista de todas as categorias.
     *
     * @return uma lista de todas as categorias.
     */
    @Transactional(readOnly = true) //Anotação para indicar que o método é transacional e que a operação é somente leitura
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        
        //Expressão lambda para converter uma lista de Category para uma lista de CategoryDTO
        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

    /**
     * Retorna uma categoria pelo seu id.
     *
     * @param id o id da categoria a ser retornada.
     * @return a categoria com o id especificado.
     * @throws ResourceNotFoundException se a categoria não for encontrada.
     */
    @Transactional(readOnly = true) //Anotação para indicar que o método é transacional e que a operação é somente leitura
    public CategoryDTO findById(Long id) {
        Optional <Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new CategoryDTO(entity);
    }

    /**
     * Insere uma nova categoria.
     *
     * @param dto o objeto DTO contendo os dados da nova categoria.
     * @return a categoria inserida.
     */
    @Transactional //Anotação para indicar que o método é transacional
    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new CategoryDTO(entity);
    }

    /**
     * Atualiza uma categoria existente.
     *
     * @param id o id da categoria a ser atualizada.
     * @param dto o objeto DTO contendo os novos dados da categoria.
     * @return a categoria atualizada.
     * @throws ResourceNotFoundException se a categoria não for encontrada.
     */
    @Transactional
    public CategoryDTO update(Long id, CategoryDTO dto) {
        try {
            Category entity = repository.getReferenceById(id);
            entity.setName(dto.getName());
            entity = repository.save(entity);
            return new CategoryDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        }
        
    }
    
    /**
     * Método responsável por deletar uma categoria do banco de dados.
     *
     * @param id Identificador da categoria a ser deletada.
     * @throws ResourceNotFoundException Exceção lançada caso a categoria não seja encontrada no banco de dados.
     * @throws DatabaseExeption Exceção lançada caso ocorra um erro no banco de dados.
     */
    //Não usar o Transactional para o delete, pois o delete é uma operação que não precisa de transação
     public void delete(Long id) throws ResourceNotFoundException, DatabaseExeption {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException("Id not found " + id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseExeption("Integrity violation");
        }
    }
    
}
