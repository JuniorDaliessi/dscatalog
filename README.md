# dscatalog

## Bootcamp Spring 3.0 - Cap. 01 CRUD

## Competências

- Criar projeto Spring Boot

- Criar monorepo Git

- Organizar o projeto em camadas

- - Controlador REST

    > Na arquitetura REST (Representational State Transfer), que é um estilo de arquitetura para sistemas distribuídos, os recursos são um dos principais conceitos. Recursos são entidades que são identificadas por um URI (Uniform Resource Identifier) e podem ser manipuladas por meio de métodos HTTP, como GET, POST, PUT, DELETE, entre outros.
    >
    > O recurso é um conceito abstrato que representa algo que o cliente deseja acessar ou manipular, como um usuário, uma mensagem, uma imagem, etc. Já o Controller REST é uma implementação concreta que é responsável por gerenciar as requisições recebidas pelo servidor para esses recursos.
    >
    > O Controller REST é responsável por receber as requisições HTTP, extrair as informações necessárias dos cabeçalhos, corpo da mensagem ou parâmetros da URL, processar essas informações e encaminhar a requisição para a camada de negócio (business logic) da aplicação, que é responsável por manipular os dados e retornar uma resposta adequada.
    >
    > Em resumo, enquanto o recurso é um conceito abstrato que representa uma entidade que pode ser acessada ou manipulada por meio de um URI, o Controller REST é uma implementação concreta que é responsável por gerenciar as requisições HTTP para esses recursos, manipular os dados e retornar as respostas adequadas.

  - Serviço

    > A camada de serviço, ou service layer, é uma camada da arquitetura de um web service que contém a lógica de negócios da aplicação. Ela é responsável por receber as solicitações dos controladores (controllers) e coordenar as operações necessárias para atender a essas solicitações.
    >
    > Em geral, a camada de serviço é a camada intermediária entre a camada de controle e a camada de acesso a dados (data access layer). Ela pode chamar os métodos de acesso a dados para recuperar informações do banco de dados, manipular essas informações e enviar a resposta de volta para os controladores.
    >
    > A camada de serviço também pode executar outras tarefas importantes, como validação de dados de entrada, aplicação de regras de negócios e tratamento de exceções. Ela pode usar outras camadas da aplicação, como a camada de segurança ou a camada de cache, para cumprir suas funções.
    >
    > Em resumo, a camada de serviço é uma camada crucial na arquitetura de um web service, pois ela contém a lógica de negócios da aplicação e é responsável por garantir que as solicitações dos controladores sejam atendidas de maneira eficiente e eficaz.

  - Acesso a dados (Repository)

    > Com certeza! A camada de acesso a dados, ou data access layer, é responsável por interagir com o banco de dados ou qualquer outra fonte de dados externa usada pelo web service. Essa camada é geralmente implementada usando um padrão de projeto de persistência, como o padrão Repository.
    >
    > Os repositórios, ou Repository, são classes que fornecem uma abstração da fonte de dados subjacente e permitem que a camada de serviço (ou outras camadas) interajam com o banco de dados ou outra fonte de dados sem precisar saber detalhes de como as operações de persistência são realizadas.
    >
    > Os repositórios geralmente expõem métodos de consulta (como `find` ou `get`) e métodos de modificação (como `save` ou `delete`) que permitem que os serviços leiam e gravem dados na fonte de dados subjacente.
    >
    > A camada de acesso a dados pode ser implementada usando vários frameworks ou bibliotecas, como o Spring Data JPA, que fornece uma maneira conveniente de criar repositórios com operações CRUD (Create, Read, Update, Delete) comuns.
    >
    > Em resumo, a camada de acesso a dados é uma camada importante na arquitetura de um web service, pois ela permite que o serviço interaja com a fonte de dados subjacente de forma eficiente e eficaz, sem precisar conhecer detalhes de como as operações de persistência são realizadas.

- Criar entidades

- Configurar perfil de teste do projeto

- Seeding da base de dados

- Criar web services REST

- - Parâmetros de rota @PathVariable
  - Parâmetros de requisição @RequestParam
  - Corpo de requisição @RequestBody
  - Resposta da requisição ResponseEntity<T>

- Padrão DTO

- CRUD completo

- Tratamento de exceções

- Postman (coleções, ambientes)

- Dados de auditoria

- Paginação de dados

- Associações entre entidades (N-N)

## Comtrolador REST 
- CategoryResource
  
  >Descrição:
  >
  >Esta classe é responsável por expor um endpoint REST para buscar todas as categorias disponíveis. Ela implementa o conceito de recurso em uma aplicação Spring Boot.
  >
  >Atributos:
  >Nenhum atributo declarado na classe.
  >
  >Métodos:
  >- findAll(): Método que retorna uma lista com todas as categorias cadastradas no sistema. Ele é mapeado para o endpoint "/categories" através da anotação @RequestMapping presente na classe.
  > - Tipo de retorno: ResponseEntity<List<Category>>
  > - Anotações: @RequestMapping (para indicar que o método responde a requisição do tipo GET do HTTP)
  > 
  > 
  >  Anotações:
  >- @RestController: Indica que a classe é um recurso web.
  >- @RequestMapping: Indica o caminho do recurso.
  >
  >Exemplo de uso:
  >Ao acessar o endpoint "/categories" através de um navegador ou de uma requisição HTTP, será retornado um JSON contendo uma lista com todas as categorias cadastradas no sistema.

## Camada de serviço

* CategoryService

  > Classe: CategoryService
  >
  > Descrição: Esta classe é responsável por fornecer serviços para as operações relacionadas a categorias. Ela utiliza a camada de acesso a dados (Repository) para recuperar as informações do banco de dados.
  >
  > Atributos:
  >
  > - repository: Atributo que representa a instância da classe CategoryRepository, responsável por prover acesso ao banco de dados.
  >
  > Métodos:
  >
  > - findAll(): Método que retorna uma lista com todas as categorias cadastradas no sistema. Ele delega a operação para a instância de CategoryRepository presente na classe.
  >   - Tipo de retorno: List<Category>
  >
  > Anotações:
  >
  > - @Service: Indica que a classe é um componente do Spring que será injetado automaticamente.
  > - @Autowired: Indica que a dependência da classe CategoryRepository será injetada automaticamente pelo Spring.
  >
  > Exemplo de uso: Ao utilizar a classe CategoryService, é possível obter uma lista com todas as categorias cadastradas no sistema através do método findAll(). Para isso, basta injetar a instância de CategoryService em outras classes e chamar o método desejado. Por exemplo:
  >
  > ```java
  > @Service
  > public class ProductService {
  > 
  > @Autowired
  > private CategoryService categoryService;
  > 
  > public List<Product> findByCategoryId(Long categoryId) {
  >     List<Category> categories = categoryService.findAll();
  >     // Busca produtos do banco de dados a partir do id da categoria
  >     // ...
  >     }
  > }
  > ```

> Neste exemplo, a classe ProductService utiliza a instância de  CategoryService para obter a lista de todas as categorias cadastradas no sistema.

## Camada de acesso a dados (Repository)

* CategoryRepository

  > A classe `CategoryRepository` é uma interface que estende a interface `JpaRepository` do Spring Data JPA, que oferece um conjunto de métodos padrão para realizar operações básicas de acesso a dados, como criar, ler, atualizar e excluir (CRUD) entidades no banco de dados.
  >
  > A anotação `@Repository` indica que a classe é um componente do Spring e será gerenciada pelo container do Spring, permitindo que ela seja injetada automaticamente em outras classes.
  >
  > Além disso, a interface `CategoryRepository` define um método `findAll()` que retorna uma lista com todas as categorias cadastradas no banco de dados.
  >
  > A interface `JpaRepository` espera dois tipos genéricos, sendo o primeiro o tipo da entidade gerenciada pelo repositório (neste caso, a classe `Category`) e o segundo o tipo do identificador da entidade (neste caso, `Long`). Essa informação é usada pelo Spring Data JPA para gerar automaticamente consultas SQL apropriadas para o banco de dados.

  

