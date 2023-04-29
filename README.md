# dscatalog

## Bootcamp Spring 3.0 - Cap. 01 CRUD

## Competências

- Criar projeto Spring Boot

- Criar monorepo Git

- Organizar o projeto em camadas Web Service

- * ![Video](https://www.youtube.com/watch?v=b8uLFfzcVQ8&t=104s)

- - ![Camadas Web Service](img/web_service.jpg)

- - Controlador REST

    > Na arquitetura REST (Representational State Transfer), que é um estilo de arquitetura para sistemas distribuídos, os recursos são um dos principais conceitos. Recursos são entidades que são identificadas por um URI (Uniform Resource Identifier) e podem ser manipuladas por meio de métodos HTTP, como GET, POST, PUT, DELETE, entre outros.
    >
    > O recurso é um conceito abstrato que representa algo que o cliente deseja acessar ou manipular, como um usuário, uma mensagem, uma imagem, etc. Já o Controller REST é uma implementação concreta que é responsável por gerenciar as requisições recebidas pelo servidor para esses recursos.
    >
    > O Controller REST é responsável por receber as requisições HTTP, extrair as informações necessárias dos cabeçalhos, corpo da mensagem ou parâmetros da URL, processar essas informações e encaminhar a requisição para a camada de negócio (business logic) da aplicação, que é responsável por manipular os dados e retornar uma resposta adequada.
    >
    > Em resumo, enquanto o recurso é um conceito abstrato que representa uma entidade que pode ser acessada ou manipulada por meio de um URI, o Controller REST é uma implementação concreta que é responsável por gerenciar as requisições HTTP para esses recursos, manipular os dados e retornar as respostas adequadas.
    >
    > 

  - Serviço

    > A camada de serviço, ou service layer, é uma camada da arquitetura de um web service que contém a lógica de negócios da aplicação. Ela é responsável por receber as solicitações dos controladores (controllers) e coordenar as operações necessárias para atender a essas solicitações.
    >
    > Em geral, a camada de serviço é a camada intermediária entre a camada de controle e a camada de acesso a dados (data access layer). Ela pode chamar os métodos de acesso a dados para recuperar informações do banco de dados, manipular essas informações e enviar a resposta de volta para os controladores.
    >
    > A camada de serviço também pode executar outras tarefas importantes, como validação de dados de entrada, aplicação de regras de negócios e tratamento de exceções. Ela pode usar outras camadas da aplicação, como a camada de segurança ou a camada de cache, para cumprir suas funções.
    >
    > Em resumo, a camada de serviço é uma camada crucial na arquitetura de um web service, pois ela contém a lógica de negócios da aplicação e é responsável por garantir que as solicitações dos controladores sejam atendidas de maneira eficiente e eficaz.
    >
    > 

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
    >
    > 

- Criar entidades

- Configurar perfil de teste do projeto

- Seeding da base de dados

  > Seeding de banco de dados é um processo utilizado para preencher o banco de dados com dados iniciais, geralmente para fins de desenvolvimento, testes ou demonstração. Esses dados podem ser utilizados para popular o banco com informações básicas que possam ser usadas para testar o comportamento do sistema em diferentes cenários ou para preencher o banco de dados com dados fictícios ou de exemplo que possam ser usados para demonstrar o funcionamento do sistema para os usuários.
  >
  > O processo de seeding geralmente é feito por meio de scripts SQL ou por meio de código em alguma linguagem de programação que insere os dados diretamente no banco de dados.
  >
  > No contexto de uma aplicação Spring Boot, é possível utilizar a classe CommandLineRunner para executar o processo de seeding automaticamente ao iniciar a aplicação. Através desse mecanismo, é possível chamar o serviço de uma determinada entidade que se encarregará de popular o banco de dados com os dados iniciais.
  >
  > 

- Criar web services REST

- - Parâmetros de rota @PathVariable
  - Parâmetros de requisição @RequestParam
  - Corpo de requisição @RequestBody
  - Resposta da requisição ResponseEntity<T>

- Padrão DTO

  > O Padrão DTO (Data Transfer Object) é um padrão de projeto de software que tem como objetivo principal a transferência de dados entre diferentes componentes de um sistema, como camadas de aplicação, serviços web ou APIs.
  >
  > O DTO é uma classe simples que contém campos (propriedades) que representam os dados que devem ser transferidos entre esses componentes. Ele não possui lógica de negócio e geralmente é utilizado para enviar dados de um servidor para um cliente ou vice-versa.
  >
  > O uso do padrão DTO pode trazer vários benefícios para um sistema, como a simplificação da comunicação entre diferentes camadas ou componentes, a redução do acoplamento entre esses componentes e a melhoria da performance, já que o DTO permite enviar apenas os dados necessários, sem sobrecarregar a rede ou o processamento.
  >
  > Exemplo de uma classe DTO em Java:
  >
  > ```java
  > public class PessoaDTO {
  >     private Long id;
  >     private String nome;
  >     private String email;
  >     // getters e setters
  > }
  > ```
  >
  > Nesse exemplo, a classe PessoaDTO representa um objeto de transferência  de dados que contém as propriedades id, nome e email. Essa classe pode  ser utilizada para transferir dados de uma pessoa entre diferentes  componentes de um sistema, sem expor os detalhes internos da entidade  Pessoa.
  >
  > 

- CRUD completo

- Tratamento de exceções

- Postman (coleções, ambientes)

- Dados de auditoria

- Paginação de dados

- Associações entre entidades (N-N)

## Comtrolador REST 
- >- ## Classe CategoryResources
  >
  >  A classe `CategoryResources` é um Rest Controller que implementa as rotas REST para manipulação de dados referentes às categorias de um aplicativo. Ela utiliza a biblioteca Spring Framework para gerenciamento de requisições HTTP.
  >
  >  ### Atributos
  >
  >  A classe possui apenas um atributo:
  >
  >  - `service`: é uma instância da classe `CategoryService` injetada automaticamente pelo Spring Framework através da anotação `@Autowired`. Essa classe é responsável por acessar os dados de categoria no banco de dados e realizar operações de CRUD (create, read, update, delete).
  >
  >  ### Métodos
  >
  >  A classe possui dois métodos públicos:
  >
  >  - `findAll()`: esse método responde a uma requisição do tipo GET para a rota `/categories`. Ele utiliza a anotação `@GetMapping` para indicar que responde a esse tipo de requisição. Esse método chama o método `findAll()` da classe `CategoryService` para obter uma lista de objetos `CategoryDTO`. Em seguida, retorna um objeto `ResponseEntity` contendo a lista de objetos `CategoryDTO` no corpo da resposta.
  >  - `findById(Long id)`: esse método responde a uma requisição do tipo GET para a rota `/categories/{id}`, onde `{id}` é um parâmetro da rota que representa o id da categoria. Ele utiliza a anotação `@GetMapping` para indicar que responde a esse tipo de requisição e recebe o parâmetro `id` com a anotação `@PathVariable`. Esse método chama o método `findById(Long id)` da classe `CategoryService`, passando o parâmetro `id`. Em seguida, retorna um objeto `ResponseEntity` contendo o objeto `CategoryDTO` no corpo da resposta.
  >
  >  ### Anotações
  >
  >  A classe utiliza duas anotações do Spring Framework:
  >
  >  - `@RestController`: essa anotação indica que a classe é um Rest Controller, ou seja, um controlador de rotas REST.
  >  - `@RequestMapping(value = "/categories")`: essa anotação indica o caminho da rota principal do recurso, que é `/categories`.
  >
  >  Além dessas anotações, cada método utiliza a anotação `@GetMapping` para indicar que responde a uma requisição do tipo GET.
  >
  >  ### Retorno
  >
  >  Os dois métodos da classe retornam objetos `ResponseEntity` com o status HTTP 200 (ok) e o corpo da resposta contendo a lista de objetos `CategoryDTO` ou o objeto `CategoryDTO` correspondente ao id fornecido.
  >
  >  ### Dependências
  >
  >  A classe `CategoryResources` depende da classe `CategoryService`, que é injetada automaticamente pelo Spring Framework através da anotação `@Autowired`.
  >
  >  ## Conclusão
  >
  >  A classe `CategoryResources` é uma implementação de um Rest Controller para manipulação de dados de categoria de um aplicativo utilizando a biblioteca Spring Framework. Ela possui métodos para obter a lista de todas as categorias e obter uma categoria específica pelo seu id. A classe depende da classe `CategoryService` para realizar as operações de CRUD no banco de dados.
  >
  >Exemplo de uso:
  >Ao acessar o endpoint "/categories" através de um navegador ou de uma requisição HTTP, será retornado um JSON contendo uma lista com todas as categorias cadastradas no sistema.
  >
  >

## Camada de serviço

* > - Classe `CategoryService`
  >
  >   A classe `CategoryService` é responsável por implementar a lógica de negócio relacionada às categorias de produtos da aplicação. A documentação detalhada da classe é apresentada a seguir:
  >
  >   Atributos:
  >
  >   - `repository`: atributo do tipo `CategoryRepository`, que representa o repositório de categorias e é injetado automaticamente pelo Spring.
  >
  >   Construtor:
  >
  >   - Não há construtor explícito definido na classe.
  >
  >   Métodos:
  >
  >   - `findAll()`: método responsável por buscar todas as categorias cadastradas no banco de dados e retornar uma lista de objetos `CategoryDTO` correspondentes a cada categoria encontrada. O método é transacional e somente faz leitura dos dados. A implementação do método é apresentada a seguir:
  >     - Tipo de retorno: `List<CategoryDTO>`
  >     - Parâmetros: nenhum
  >     - Exceções lançadas: nenhuma
  >     - Comportamento: o método busca todas as categorias cadastradas no banco de dados através do método `findAll()` do `CategoryRepository`, converte cada objeto `Category` retornado em um objeto `CategoryDTO` através de uma expressão lambda e retorna uma lista com os objetos `CategoryDTO` convertidos.
  >   - `findById(Long id)`: método responsável por buscar uma categoria específica no banco de dados pelo id informado como parâmetro e retornar um objeto `CategoryDTO` correspondente à categoria encontrada. O método é transacional e somente faz leitura dos dados. A implementação do método é apresentada a seguir:
  >     - Tipo de retorno: `CategoryDTO`
  >     - Parâmetros:
  >       - `id`: parâmetro do tipo `Long` que representa o id da categoria a ser buscada.
  >     - Exceções lançadas:
  >       - `NoSuchElementException`: lançada se a categoria não for encontrada no banco de dados.
  >     - Comportamento: o método busca uma categoria específica no banco de dados pelo id informado como parâmetro, através do método `findById(id)` do `CategoryRepository`. Se a categoria não for encontrada, o método lança uma exceção `NoSuchElementException`. Se a categoria for encontrada, o método converte o objeto `Category` retornado em um objeto `CategoryDTO` e o retorna.
  >
  >   A classe `CategoryService` utiliza as seguintes anotações:
  >
  >   - `@Service`: anotação que indica que a classe é um componente do Spring que será gerenciado pelo container e que pode ser injetado em outras classes.
  >   - `@Autowired`: anotação que indica que a dependência `CategoryRepository` será injetada automaticamente pelo Spring.
  >   - `@Transactional`: anotação que indica que o método é transacional e que a operação é somente leitura.
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
>
> 

## Camada de acesso a dados (Repository)

* CategoryRepository

  > A classe `CategoryRepository` é uma interface que estende a interface `JpaRepository` do Spring Data JPA, que oferece um conjunto de métodos padrão para realizar operações básicas de acesso a dados, como criar, ler, atualizar e excluir (CRUD) entidades no banco de dados.
  >
  > A anotação `@Repository` indica que a classe é um componente do Spring e será gerenciada pelo container do Spring, permitindo que ela seja injetada automaticamente em outras classes.
  >
  > Além disso, a interface `CategoryRepository` define um método `findAll()` que retorna uma lista com todas as categorias cadastradas no banco de dados.
  >
  > A interface `JpaRepository` espera dois tipos genéricos, sendo o primeiro o tipo da entidade gerenciada pelo repositório (neste caso, a classe `Category`) e o segundo o tipo do identificador da entidade (neste caso, `Long`). Essa informação é usada pelo Spring Data JPA para gerar automaticamente consultas SQL apropriadas para o banco de dados.

  

