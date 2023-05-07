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

- * Claro! Aqui está um exemplo de criação de entidades em Java usando o JPA (Java Persistence API):

    1. Entidade `Product`:

    ```java
    @Entity
    @Table(name = "products")
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String name;
    
        // Outros atributos e relacionamentos
    
        // Getters e setters
    }
    ```

    2. Entidade `Category`:

    ```java
    @Entity
    @Table(name = "categories")
    public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String name;
    
        // Outros atributos e relacionamentos
    
        // Getters e setters
    }
    ```

    No exemplo acima, as classes `Product` e `Category` são anotadas com `@Entity`, indicando que são entidades mapeadas para o banco de dados. As anotações `@Table` especificam o nome das tabelas correspondentes no banco de dados.

    Cada entidade possui um identificador único, representado pela anotação `@Id`, juntamente com uma estratégia de geração automática de valor, indicada pela anotação `@GeneratedValue`.

    Além disso, você pode adicionar outros atributos e relacionamentos às entidades de acordo com as necessidades do seu domínio. Certifique-se de adicionar os getters e setters correspondentes para cada atributo.

    Lembre-se de ajustar o exemplo de acordo com o seu domínio e as necessidades específicas da sua aplicação.

- Configurar perfil de teste do projeto

- * Para configurar um perfil de teste em um projeto Java, você pode seguir os seguintes passos:

    1. Crie um arquivo de propriedades específico para o perfil de teste. Por exemplo, crie um arquivo chamado `application-test.properties` na pasta `src/main/resources`. Neste arquivo, você pode definir configurações específicas para o perfil de teste. Por exemplo:

    ```properties
    # Configurações de banco de dados para o perfil de teste
    spring.datasource.url=jdbc:mysql://localhost/test_db
    spring.datasource.username=test_user
    spring.datasource.password=test_password
    
    # Outras configurações específicas de teste
    ```

    2. No arquivo de configuração principal do projeto, geralmente chamado de `application.properties` ou `application.yml`, você pode definir as configurações padrão do projeto. Por exemplo:

    ```properties
    # Configurações de banco de dados padrão
    spring.datasource.url=jdbc:mysql://localhost/main_db
    spring.datasource.username=main_user
    spring.datasource.password=main_password
    
    # Outras configurações padrão
    ```

    3. No arquivo de configuração de teste específico, como `application-test.properties`, você pode substituir as configurações padrão pelas configurações de teste. Por exemplo:

    ```properties
    # Sobrescrevendo as configurações de banco de dados para o perfil de teste
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.username=testuser
    spring.datasource.password=testpassword
    
    # Outras configurações específicas de teste
    ```

    4. Para ativar o perfil de teste durante a execução dos testes, você pode usar a anotação `@ActiveProfiles` nos seus testes. Por exemplo:

    ```java
    @ActiveProfiles("test")
    public class MeuTeste {
        // Testes aqui
    }
    ```

    Ao executar os testes, o Spring Boot carregará as configurações do perfil de teste definidas no arquivo `application-test.properties` e sobrescreverá as configurações padrão.

    Certifique-se de que a configuração de teste esteja corretamente configurada no arquivo `pom.xml` ou `build.gradle` do seu projeto para permitir a execução dos testes com o perfil de teste ativado.

    Essas são apenas diretrizes básicas para configurar um perfil de teste em um projeto Java com Spring Boot. Você pode ajustar as configurações e arquivos conforme necessário, dependendo das suas necessidades específicas.

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
  - * > A anotação `@PathVariable` é usada para mapear um parâmetro de rota em um método de um controlador REST. Ela indica que o valor do parâmetro será extraído da parte variável da URL da requisição.
      >
      > Por exemplo, considerando a seguinte rota `/categories/{id}`, onde `{id}` é o parâmetro de rota que representa o ID da categoria, podemos usar `@PathVariable` para receber esse ID como parâmetro em um método do controlador.
      >
      > Exemplo de uso:
      >
      > ```java
      > @GetMapping("/categories/{id}")
      > public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Long id) {
      >     // Lógica para obter a categoria pelo ID
      >     // ...
      >     return ResponseEntity.ok().body(categoryDTO);
      > }
      > ```
      >
      > Nesse exemplo, o valor do parâmetro `{id}` na URL será atribuído ao parâmetro `id` do método `getCategoryById()`. Assim, quando uma requisição for feita para `/categories/1`, o valor `1` será passado como argumento para o parâmetro `id` do método.
      >
      > A anotação `@PathVariable` também permite a especificação de um nome diferente para o parâmetro em relação ao nome na URL. Por exemplo:
      >
      > ```java
      > @GetMapping("/categories/{categoryId}")
      > public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable("categoryId") Long id) {
      >     // Lógica para obter a categoria pelo ID
      >     // ...
      >     return ResponseEntity.ok().body(categoryDTO);
      > }
      > ```
      >
      > Nesse caso, o valor do parâmetro `{categoryId}` na URL será atribuído ao parâmetro `id` do método `getCategoryById()`. O nome do parâmetro na URL não precisa coincidir com o nome do parâmetro no método, mas é recomendado para facilitar a compreensão do código.
      >
      > É importante observar que o tipo do parâmetro `@PathVariable` deve ser compatível com o tipo do valor na URL da rota. No exemplo acima, o tipo do parâmetro é `Long` porque o ID é esperado como um número inteiro.
  - Parâmetros de requisição @RequestParam
  - * > A anotação `@RequestParam` é usada para mapear parâmetros de requisição em um método de um controlador REST. Ela indica que o valor do parâmetro será extraído dos parâmetros da requisição HTTP.
      >
      > Por padrão, a anotação `@RequestParam` espera que o parâmetro esteja presente na requisição. Se nenhum valor for fornecido para o parâmetro, será lançada uma exceção `MissingServletRequestParameterException`. No entanto, podemos tornar o parâmetro opcional usando o atributo `required` da anotação.
      >
      > Exemplo de uso:
      >
      > ```java
      > @GetMapping("/categories")
      > public ResponseEntity<List<CategoryDTO>> getCategoriesByType(@RequestParam String type) {
      >     // Lógica para obter as categorias por tipo
      >     // ...
      >     return ResponseEntity.ok().body(categoryDTOList);
      > }
      > ```
      >
      > Nesse exemplo, estamos mapeando o parâmetro de requisição `type` usando `@RequestParam`. O valor desse parâmetro será extraído dos parâmetros da requisição HTTP. Por exemplo, uma requisição GET para `/categories?type=electronics` resultará no valor "electronics" sendo atribuído ao parâmetro `type` do método `getCategoriesByType()`.
      >
      > Podemos fornecer um valor padrão para um parâmetro opcional usando o atributo `defaultValue` da anotação `@RequestParam`.
      >
      > Exemplo de uso de parâmetro opcional com valor padrão:
      >
      > ```java
      > @GetMapping("/categories")
      > public ResponseEntity<List<CategoryDTO>> getCategoriesByType(
      >         @RequestParam(required = false, defaultValue = "all") String type) {
      >     // Lógica para obter as categorias por tipo
      >     // ...
      >     return ResponseEntity.ok().body(categoryDTOList);
      > }
      > ```
      >
      > Nesse exemplo, o parâmetro `type` é opcional porque `required = false` está definido na anotação. Além disso, se nenhum valor for fornecido para o parâmetro, o valor padrão "all" será atribuído ao parâmetro.
      >
      > A anotação `@RequestParam` também permite especificar nomes diferentes para os parâmetros de requisição em relação aos nomes esperados. Por exemplo:
      >
      > ```java
      > @GetMapping("/categories")
      > public ResponseEntity<List<CategoryDTO>> getCategoriesByType(
      >         @RequestParam("categoryType") String type) {
      >     // Lógica para obter as categorias por tipo
      >     // ...
      >     return ResponseEntity.ok().body(categoryDTOList);
      > }
      > ```
      >
      > Nesse caso, estamos mapeando o parâmetro de requisição `categoryType` usando `@RequestParam`. O valor desse parâmetro será extraído dos parâmetros da requisição HTTP. O nome do parâmetro na requisição não precisa coincidir com o nome do parâmetro no método, mas é recomendado para facilitar a compreensão do código.
      >
      > É importante observar que o tipo do parâmetro `@RequestParam` deve ser compatível com o tipo esperado para o valor do parâmetro na requisição. Por exemplo, se o valor do parâmetro for um número, o tipo do parâmetro deve ser numérico (por exemplo, `int`, `long`, `float`).
  - Corpo de requisição @RequestBody
  - * > A anotação `@RequestBody` é usada para mapear o corpo de uma requisição HTTP para um objeto Java em um método de um controlador REST. Ela indica que o corpo da requisição será convertido automaticamente para o objeto especificado.
      >
      > Quando usamos `@RequestBody`, o conteúdo da requisição (geralmente em formato JSON) é desserializado automaticamente para um objeto Java correspondente. Isso é especialmente útil ao lidar com requisições POST ou PUT, onde os dados são enviados no corpo da requisição para criar ou atualizar recursos.
      >
      > Exemplo de uso:
      >
      > ```java
      > @PostMapping("/categories")
      > public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
      >     // Lógica para criar uma nova categoria com base nos dados recebidos no corpo da requisição
      >     // ...
      >     return ResponseEntity.created().body(createdCategoryDTO);
      > }
      > ```
      >
      > Nesse exemplo, estamos usando `@RequestBody` para mapear o corpo da requisição para um objeto `CategoryDTO`. O conteúdo da requisição, que deve estar no formato JSON correspondente à estrutura do objeto `CategoryDTO`, será automaticamente convertido em um objeto `CategoryDTO` e atribuído ao parâmetro `categoryDTO` do método `createCategory()`.
      >
      > A anotação `@RequestBody` também pode ser usada para outros tipos de dados além de objetos DTO, como listas, arrays, etc. Além disso, é possível adicionar validações e restrições aos campos do objeto usando anotações como `@Valid` e outras anotações de validação disponíveis no Spring Framework.
      >
      > É importante lembrar que o uso correto da anotação `@RequestBody` depende da estrutura e do formato dos dados enviados no corpo da requisição. Certifique-se de que o conteúdo da requisição esteja de acordo com a estrutura esperada pelo objeto Java para que a desserialização ocorra corretamente.
  - Resposta da requisição ResponseEntity<T>
  - * > A classe `ResponseEntity` é usada para encapsular a resposta de um controlador REST em Spring. Ela permite definir o status HTTP, os cabeçalhos e o corpo da resposta.
      >
      > Ao retornar um objeto `ResponseEntity` em um método de um controlador REST, você tem mais controle sobre a resposta HTTP que será enviada de volta ao cliente. Você pode definir o código de status, os cabeçalhos da resposta e o corpo da resposta.
      >
      > Existem várias formas de criar um objeto `ResponseEntity`, dependendo do tipo de resposta que você deseja enviar. Alguns exemplos comuns são:
      >
      > 1. Resposta vazia com status OK:
      > ```java
      > return ResponseEntity.ok().build();
      > ```
      >
      > 2. Resposta com objeto no corpo e status OK:
      > ```java
      > CategoryDTO categoryDTO = new CategoryDTO("1", "Example Category");
      > return ResponseEntity.ok().body(categoryDTO);
      > ```
      >
      > 3. Resposta com cabeçalhos personalizados:
      > ```java
      > HttpHeaders headers = new HttpHeaders();
      > headers.add("Custom-Header", "Value");
      > return ResponseEntity.ok().headers(headers).body(categoryDTO);
      > ```
      >
      > 4. Resposta com código de status específico:
      > ```java
      > return ResponseEntity.status(HttpStatus.CREATED).body(categoryDTO);
      > ```
      >
      > Além disso, a classe `ResponseEntity` possui diversos métodos úteis para manipular a resposta HTTP, como `created()`, `badRequest()`, `notFound()`, entre outros. Esses métodos ajudam a construir respostas comuns de forma mais conveniente.
      >
      > É importante notar que o uso de `ResponseEntity` é opcional. Se você não especificar explicitamente um `ResponseEntity` em um método de um controlador REST, o Spring fará uma inferência automática com base no valor retornado. Por exemplo, se você retornar um objeto, o Spring converterá automaticamente em uma resposta JSON com o status OK.
      >
      > Em resumo, a classe `ResponseEntity` permite personalizar a resposta HTTP retornada por um controlador REST em Spring, permitindo definir o status, os cabeçalhos e o corpo da resposta de forma flexível.
  
- Padrão DTO

  > O Padrão DTO (Data Transfer Object) é um padrão de projeto de software que tem como objetivo principal a transferência de dados entre diferentes componentes de um sistema, como camadas de aplicação, serviços web ou APIs.
  >
  > O padrão DTO (Data Transfer Object) é um padrão de projeto utilizado para transferir dados entre diferentes camadas de uma aplicação ou entre sistemas distribuídos. Ele permite a encapsulação dos dados necessários para uma operação específica, evitando a exposição direta das entidades de domínio.
  >
  > Vamos considerar as classes de exemplo mencionadas anteriormente:
  >
  > 1. Classe de Entidade `Product`:
  > ```java
  > @Entity
  > @Table(name = "products")
  > public class Product implements Serializable {
  >     @Id
  >     @GeneratedValue(strategy = GenerationType.IDENTITY)
  >     private Long id;
  > 
  >     private String name;
  > 
  >     private double price;
  > 
  >     // Getters e setters
  > }
  > ```
  >
  > 2. Classe DTO correspondente `ProductDTO`:
  > ```java
  > public class ProductDTO {
  >     private Long id;
  >     private String name;
  > 
  >     // Getters e setters
  > }
  > ```
  >
  > No exemplo acima, a classe `Product` representa a entidade de domínio com todos os seus atributos anotados com as informações de persistência. Já a classe `ProductDTO` é um objeto simplificado que contém apenas os dados necessários para uma operação específica, como exibição de lista de produtos.
  >
  > Ao utilizar o padrão DTO, é possível definir diferentes classes DTO para diferentes operações, adaptando os dados conforme as necessidades. Por exemplo, se houver uma operação de listagem de produtos, é possível criar um DTO que contém apenas os atributos relevantes para essa operação, como o `ProductDTO` mencionado anteriormente.
  >
  > Dessa forma, quando a aplicação precisar transferir dados da camada de persistência para a camada de apresentação, em vez de transferir diretamente as entidades `Product`, podem-se utilizar os DTOs correspondentes, reduzindo a quantidade de dados transferidos e protegendo as entidades de domínio.
  >
  > O mapeamento entre as entidades e os DTOs pode ser feito manualmente ou por meio de bibliotecas de mapeamento, como o ModelMapper ou o MapStruct, para facilitar o processo de conversão de objetos.
  >
  > O uso do padrão DTO traz benefícios como a redução da quantidade de dados transferidos, a proteção dos objetos de domínio e a flexibilidade para adaptar os dados conforme as necessidades de cada operação. Além disso, ele facilita a manutenção e evolução da aplicação, pois as mudanças nas entidades de domínio não afetam diretamente os DTOs utilizados nas camadas superiores.
  >
  > É importante ressaltar que o uso de DTOs deve ser avaliado de acordo com as necessidades e complexidade da aplicação, sendo uma opção útil em casos onde há a separação clara entre as camadas e a necessidade de adaptar os dados transferidos.
  >
  > 

- CRUD completo

- * > Para exemplificar um CRUD completo utilizando as classes mencionadas, vou fornecer um exemplo completo de um CRUD de categorias em um aplicativo.
    >
    > 1. Classe `CategoryResources` (Rest Controller):
    >
    > ```java
    > @RestController
    > @RequestMapping("/categories")
    > public class CategoryResources {
    > 
    >     @Autowired
    >     private CategoryService categoryService;
    > 
    >     @GetMapping
    >     public ResponseEntity<List<CategoryDTO>> findAll() {
    >         List<CategoryDTO> categories = categoryService.findAll();
    >         return ResponseEntity.ok().body(categories);
    >     }
    > 
    >     @GetMapping("/{id}")
    >     public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
    >         CategoryDTO category = categoryService.findById(id);
    >         return ResponseEntity.ok().body(category);
    >     }
    > 
    >     @PostMapping
    >     public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO categoryDTO) {
    >         CategoryDTO createdCategory = categoryService.insert(categoryDTO);
    >         return ResponseEntity.created(URI.create("/categories/" + createdCategory.getId())).body(createdCategory);
    >     }
    > 
    >     @PutMapping("/{id}")
    >     public ResponseEntity<CategoryDTO> update(@PathVariable Long id, @RequestBody CategoryDTO categoryDTO) {
    >         CategoryDTO updatedCategory = categoryService.update(id, categoryDTO);
    >         return ResponseEntity.ok().body(updatedCategory);
    >     }
    > 
    >     @DeleteMapping("/{id}")
    >     public ResponseEntity<Void> delete(@PathVariable Long id) {
    >         categoryService.delete(id);
    >         return ResponseEntity.noContent().build();
    >     }
    > }
    > ```
    >
    > 2. Classe `CategoryService` (Service):
    >
    > ```java
    > @Service
    > public class CategoryService {
    > 
    >     @Autowired
    >     private CategoryRepository categoryRepository;
    > 
    >     public List<CategoryDTO> findAll() {
    >         List<Category> categories = categoryRepository.findAll();
    >         return categories.stream().map(CategoryDTO::new).collect(Collectors.toList());
    >     }
    > 
    >     public CategoryDTO findById(Long id) {
    >         Category category = categoryRepository.findById(id)
    >                 .orElseThrow(() -> new EntityNotFoundException("Category not found with ID: " + id));
    >         return new CategoryDTO(category);
    >     }
    > 
    >     public CategoryDTO insert(CategoryDTO categoryDTO) {
    >         Category category = new Category();
    >         category.setName(categoryDTO.getName());
    >         // ... outros atributos da categoria
    >         Category savedCategory = categoryRepository.save(category);
    >         return new CategoryDTO(savedCategory);
    >     }
    > 
    >     public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
    >         Category category = categoryRepository.findById(id)
    >                 .orElseThrow(() -> new EntityNotFoundException("Category not found with ID: " + id));
    >         category.setName(categoryDTO.getName());
    >         // ... outros atributos da categoria
    >         Category updatedCategory = categoryRepository.save(category);
    >         return new CategoryDTO(updatedCategory);
    >     }
    > 
    >     public void delete(Long id) {
    >         Category category = categoryRepository.findById(id)
    >                 .orElseThrow(() -> new EntityNotFoundException("Category not found with ID: " + id));
    >         categoryRepository.delete(category);
    >     }
    > }
    > ```
    >
    > 3. Classe `CategoryDTO` (DTO):
    >
    > ```java
    > public class CategoryDTO {
    > 
    >     private Long id;
    >     private String name;
    >     // ... outros atributos
    > 
    >     public CategoryDTO() {
    >     }
    > 
    >     public CategoryDTO(Category category) {
    >         this.id = category.getId();
    >         this.name = category.getName();
    >         // ... outros atributos
    >     }
    > 
    >     // getters e setters
    > }
    > ```
    >
    > 4. Classe `CategoryRepository` (Repository):
    >
    > ```java
    > @Repository
    > public interface CategoryRepository extends JpaRepository<Category, Long> {
    > }
    > ```
    >
    > Essas classes exemplificam um CRUD completo para operações de criação, leitura, atualização e exclusão de categorias em um aplicativo. Você pode fazer ajustes e adicionar validações de acordo com as necessidades do seu projeto. Além disso, é importante configurar corretamente as dependências e o ambiente de execução para que o CRUD funcione.

- Tratamento de exceções

- * > O tratamento de exceções em um controlador REST em Spring pode ser feito usando a anotação `@ExceptionHandler` em um método específico ou usando a anotação `@ControllerAdvice` para tratar exceções de forma global.
    >
    > 1. Tratamento de exceções específicas:
    >
    > ```java
    > @RestController
    > public class ExampleController {
    > 
    >     @GetMapping("/example")
    >     public ResponseEntity<String> exampleMethod() {
    >         // Código que pode gerar exceções
    >     }
    > 
    >     @ExceptionHandler(ExampleException.class)
    >     public ResponseEntity<String> handleExampleException(ExampleException ex) {
    >         // Tratamento específico para a exceção ExampleException
    >         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro durante o processamento");
    >     }
    > }
    > ```
    >
    > Nesse exemplo, o método `handleExampleException` é anotado com `@ExceptionHandler(ExampleException.class)`, indicando que ele trata a exceção `ExampleException`. Dentro do método, você pode implementar o tratamento específico para essa exceção e retornar uma resposta adequada.
    >
    > 2. Tratamento de exceções global:
    >
    > ```java
    > @ControllerAdvice
    > public class GlobalExceptionHandler {
    > 
    >     @ExceptionHandler(Exception.class)
    >     public ResponseEntity<String> handleGlobalException(Exception ex) {
    >         // Tratamento global para exceções
    >         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro durante o processamento");
    >     }
    > }
    > ```
    >
    > Nesse exemplo, a classe `GlobalExceptionHandler` é anotada com `@ControllerAdvice`, indicando que ela trata exceções globalmente em todos os controladores. O método `handleGlobalException` é anotado com `@ExceptionHandler(Exception.class)`, indicando que ele trata qualquer exceção que ocorra. Dentro do método, você pode implementar o tratamento global para exceções e retornar uma resposta adequada.
    >
    > É importante ressaltar que o tratamento de exceções em controladores REST em Spring oferece flexibilidade para personalizar as respostas de erro de acordo com as suas necessidades. Você pode retornar diferentes códigos de status HTTP, mensagens de erro personalizadas e outros detalhes relevantes para o cliente da API.

- Postman (coleções, ambientes)

- * > O Postman é uma ferramenta amplamente utilizada para testar e documentar APIs. Ele permite enviar requisições HTTP para o seu serviço web e analisar as respostas. Duas funcionalidades-chave do Postman são as coleções e os ambientes, que ajudam a organizar e automatizar o processo de teste e documentação da API.
    >
    > **Coleções no Postman:**
    > Uma coleção no Postman é um conjunto de requisições relacionadas que podem ser agrupadas para facilitar a execução e a organização. Você pode criar uma coleção para sua API e adicionar diferentes requisições, como GET, POST, PUT, DELETE, etc., juntamente com os parâmetros, cabeçalhos e corpo da requisição. As coleções podem ser exportadas e importadas em diferentes ambientes e compartilhadas com outros membros da equipe.
    >
    > **Ambientes no Postman:**
    > Um ambiente no Postman é uma maneira de definir variáveis e valores que podem ser usados em suas requisições. Você pode criar um ambiente para cada ambiente em que sua API está sendo executada, como desenvolvimento, teste e produção. Por exemplo, você pode definir uma variável "baseURL" no ambiente para armazenar a URL base da sua API e usar essa variável em todas as suas requisições. Isso facilita a alteração da URL em um único lugar, em vez de atualizar todas as requisições individualmente.
    >
    > Com o uso de coleções e ambientes, você pode automatizar seus testes de API no Postman. Por exemplo, você pode definir diferentes ambientes para cada estágio do ciclo de vida da sua API e configurar scripts de teste nas requisições para verificar automaticamente as respostas e garantir que sua API esteja funcionando corretamente. Além disso, você pode gerar documentação automática da API com base nas requisições e exemplos fornecidos na coleção.
    >
    > O Postman oferece muitos recursos adicionais, como a capacidade de definir testes automatizados, simular respostas de servidor, compartilhar coleções com outros membros da equipe e gerar relatórios de teste. É uma ferramenta poderosa para o desenvolvimento e teste de APIs.

- Dados de auditoria

- * > Para adicionar dados de auditoria em suas entidades, você pode seguir as etapas a seguir:
    >
    > 1. Adicionar campos de auditoria na sua entidade:
    >
    > ```java
    > import java.time.LocalDateTime;
    > 
    > @Entity
    > @Table(name = "categories")
    > public class Category implements Serializable {
    >     // ...
    > 
    >     @Column(name = "created_at")
    >     private LocalDateTime createdAt;
    > 
    >     @Column(name = "updated_at")
    >     private LocalDateTime updatedAt;
    > 
    >     // getters e setters
    > 
    >     @PrePersist
    >     public void prePersist() {
    >         this.createdAt = LocalDateTime.now();
    >         this.updatedAt = LocalDateTime.now();
    >     }
    > 
    >     @PreUpdate
    >     public void preUpdate() {
    >         this.updatedAt = LocalDateTime.now();
    >     }
    > }
    > ```
    >
    > 2. Atualizar a classe `CategoryService` para definir as informações de auditoria:
    >
    > ```java
    > import org.springframework.stereotype.Service;
    > 
    > @Service
    > public class CategoryService {
    > 
    >     @Autowired
    >     private CategoryRepository categoryRepository;
    > 
    >     public CategoryDTO insert(CategoryDTO categoryDTO) {
    >         Category category = new Category();
    >         category.setName(categoryDTO.getName());
    >         // ... outros atributos da categoria
    >         // Configurar as informações de auditoria
    >         category.setCreatedAt(LocalDateTime.now());
    >         category.setUpdatedAt(LocalDateTime.now());
    >         Category savedCategory = categoryRepository.save(category);
    >         return new CategoryDTO(savedCategory);
    >     }
    > 
    >     public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
    >         Category category = categoryRepository.findById(id)
    >                 .orElseThrow(() -> new EntityNotFoundException("Category not found with ID: " + id));
    >         category.setName(categoryDTO.getName());
    >         // ... outros atributos da categoria
    >         // Atualizar as informações de auditoria
    >         category.setUpdatedAt(LocalDateTime.now());
    >         Category updatedCategory = categoryRepository.save(category);
    >         return new CategoryDTO(updatedCategory);
    >     }
    > 
    >     // ...
    > }
    > ```
    >
    > Dessa forma, os campos `createdAt` e `updatedAt` serão preenchidos automaticamente antes de persistir uma nova entidade ou atualizar uma existente.
    >
    > Você também pode adicionar outros campos de auditoria, como o usuário responsável pela criação ou atualização, dependendo dos requisitos do seu sistema. Basta adicionar os campos relevantes na entidade e atualizar a lógica de preenchimento correspondente nos métodos `prePersist` e `preUpdate` ou em outros pontos relevantes, conforme necessário.
    >
    > Lembre-se de ajustar o exemplo de acordo com as suas necessidades e configurar corretamente as dependências e o ambiente de execução.

- Paginação de dados

- * > Para implementar a paginação de dados em uma aplicação, você pode seguir os passos a seguir:
    >
    > 1. Atualizar o método de consulta no `CategoryService` para adicionar suporte à paginação:
    >
    > ```java
    > import org.springframework.data.domain.Page;
    > import org.springframework.data.domain.Pageable;
    > import org.springframework.stereotype.Service;
    > 
    > @Service
    > public class CategoryService {
    > 
    >     @Autowired
    >     private CategoryRepository categoryRepository;
    > 
    >     public Page<CategoryDTO> findAll(Pageable pageable) {
    >         Page<Category> categories = categoryRepository.findAll(pageable);
    >         return categories.map(CategoryDTO::new);
    >     }
    > 
    >     // ...
    > }
    > ```
    >
    > 2. Atualizar o método no `CategoryResources` para receber os parâmetros de paginação:
    >
    > ```java
    > import org.springframework.data.domain.Page;
    > import org.springframework.data.domain.Pageable;
    > import org.springframework.http.ResponseEntity;
    > import org.springframework.web.bind.annotation.GetMapping;
    > import org.springframework.web.bind.annotation.RequestMapping;
    > import org.springframework.web.bind.annotation.RestController;
    > 
    > @RestController
    > @RequestMapping("/categories")
    > public class CategoryResources {
    > 
    >     @Autowired
    >     private CategoryService categoryService;
    > 
    >     @GetMapping
    >     public ResponseEntity<Page<CategoryDTO>> findAll(Pageable pageable) {
    >         Page<CategoryDTO> categories = categoryService.findAll(pageable);
    >         return ResponseEntity.ok().body(categories);
    >     }
    > 
    >     // ...
    > }
    > ```
    >
    > 3. Agora você pode usar os parâmetros de paginação ao fazer uma solicitação GET para a rota `/categories`. Você pode especificar os parâmetros de página, tamanho da página, classificação e muito mais. Aqui está um exemplo de URL com parâmetros de paginação:
    >
    > ```http
    > GET /categories?page=0&size=10&sort=name,asc
    > ```
    >
    > Este exemplo solicita a primeira página com 10 categorias por página, ordenadas pelo nome em ordem crescente.
    >
    > Certifique-se de ajustar o exemplo de acordo com o seu código existente, incluindo a configuração correta das dependências e a definição adequada do ambiente de execução.

- Associações entre entidades (N-N)

- * > Quando lidamos com associações entre entidades muitos-para-muitos (N-N), geralmente precisamos usar uma tabela de junção para representar essa relação no banco de dados. Vou explicar como fazer isso utilizando um exemplo de associação entre as entidades `Product` e `Category`.
    >
    > 1. Definição das entidades:
    >
    > ```java
    > @Entity
    > @Table(name = "products")
    > public class Product {
    >     @Id
    >     @GeneratedValue(strategy = GenerationType.IDENTITY)
    >     private Long id;
    > 
    >     private String name;
    > 
    >     // Outros atributos e relacionamentos
    > 
    >     @ManyToMany
    >     @JoinTable(name = "product_category",
    >                joinColumns = @JoinColumn(name = "product_id"),
    >                inverseJoinColumns = @JoinColumn(name = "category_id"))
    >     private List<Category> categories;
    > 
    >     // Getters e setters
    > }
    > 
    > @Entity
    > @Table(name = "categories")
    > public class Category {
    >     @Id
    >     @GeneratedValue(strategy = GenerationType.IDENTITY)
    >     private Long id;
    > 
    >     private String name;
    > 
    >     // Outros atributos e relacionamentos
    > 
    >     @ManyToMany(mappedBy = "categories")
    >     private List<Product> products;
    > 
    >     // Getters e setters
    > }
    > ```
    >
    > 2. Na entidade `Product`, usamos a anotação `@ManyToMany` para indicar o relacionamento muitos-para-muitos com a entidade `Category`. Também usamos a anotação `@JoinTable` para especificar a tabela de junção que será criada no banco de dados. É necessário fornecer os nomes das colunas que representam as chaves estrangeiras de cada entidade na tabela de junção.
    >
    > 3. Na entidade `Category`, usamos a anotação `@ManyToMany(mappedBy = "categories")` para indicar que o relacionamento muitos-para-muitos é mapeado pela propriedade `categories` na entidade `Product`. Isso significa que a tabela de junção será criada com base nas configurações feitas na entidade `Product`.
    >
    > 4. Com essa configuração, você pode realizar operações de associação entre `Product` e `Category`. Por exemplo, para associar um produto a uma categoria:
    >
    > ```java
    > Product product = productService.findById(productId);
    > Category category = categoryService.findById(categoryId);
    > 
    > product.getCategories().add(category);
    > productService.save(product);
    > ```
    >
    > 5. Para consultar os produtos de uma determinada categoria:
    >
    > ```java
    > Category category = categoryService.findById(categoryId);
    > List<Product> products = category.getProducts();
    > ```
    >
    > Essas são as etapas básicas para configurar uma associação muitos-para-muitos entre entidades no JPA. Lembre-se de ajustar o exemplo de acordo com o seu domínio e as necessidades específicas da sua aplicação.

## Comtrolador REST 
- >## Classe CategoryResources
  >
  >A classe `CategoryResources` é um Rest Controller que implementa as rotas REST para manipulação de dados referentes às categorias de um aplicativo. Ela utiliza a biblioteca Spring Framework para gerenciamento de requisições HTTP.
  >
  >### Atributos
  >
  >A classe possui apenas um atributo:
  >
  >- `service`: é uma instância da classe `CategoryService` injetada automaticamente pelo Spring Framework através da anotação `@Autowired`. Essa classe é responsável por acessar os dados de categoria no banco de dados e realizar operações de CRUD (create, read, update, delete).
  >
  >### Métodos
  >
  >A classe possui três métodos públicos:
  >
  >- `findAll()`: esse método responde a uma requisição do tipo GET para a rota `/categories`. Ele utiliza a anotação `@GetMapping` para indicar que responde a esse tipo de requisição. Esse método chama o método `findAll()` da classe `CategoryService` para obter uma lista de objetos `CategoryDTO`. Em seguida, retorna um objeto `ResponseEntity` contendo a lista de objetos `CategoryDTO` no corpo da resposta.
  >- `findById(Long id)`: esse método responde a uma requisição do tipo GET para a rota `/categories/{id}`, onde `{id}` é um parâmetro da rota que representa o id da categoria. Ele utiliza a anotação `@GetMapping` para indicar que responde a esse tipo de requisição e recebe o parâmetro `id` com a anotação `@PathVariable`. Esse método chama o método `findById(Long id)` da classe `CategoryService`, passando o parâmetro `id`. Em seguida, retorna um objeto `ResponseEntity` contendo o objeto `CategoryDTO` no corpo da resposta.
  >- `insert(CategoryDTO dto)`: esse método responde a uma requisição do tipo POST para a rota `/categories`. Ele utiliza a anotação `@PostMapping` para indicar que responde a esse tipo de requisição e recebe um objeto `CategoryDTO` no corpo da requisição com a anotação `@RequestBody`. Esse método chama o método `insert(CategoryDTO dto)` da classe `CategoryService`, passando o objeto `CategoryDTO`. Em seguida, retorna um objeto `ResponseEntity` contendo o objeto `CategoryDTO` inserido no corpo da resposta e um header `Location` com a URL para acessar o objeto inserido.
  >
  >### Anotações
  >
  >A classe utiliza três anotações do Spring Framework:
  >
  >- `@RestController`: essa anotação indica que a classe é um Rest Controller, ou seja, um controlador de rotas REST.
  >- `@RequestMapping(value = "/categories")`: essa anotação indica o caminho da rota principal do recurso, que é `/categories`.
  >- `@Autowired`: essa anotação é utilizada para injetar a dependência da classe `CategoryService`.
  >
  >Além dessas anotações, cada método utiliza a anotação `@GetMapping` ou `@PostMapping` para indicar que responde a uma requisição do tipo GET ou POST.
  >
  >### Retorno
  >
  >Os métodos `findAll()` e `findById(Long id)` da classe retornam objetos `ResponseEntity` com o status HTTP 200 (ok) e o corpo da resposta contendo a lista de objetos `CategoryDTO` ou o objeto `CategoryDTO` correspondente ao id fornecido. O método `insert(CategoryDTO dto)` retorna um objeto `ResponseEntity` com o status HTTP 201 (created) e o objeto `CategoryDTO` inserido no corpo
  >
  >### Dependências
  >
  >A classe `CategoryResources` depende da classe `CategoryService`, que é injetada automaticamente pelo Spring Framework através da anotação `@Autowired`.
  >
  >## Conclusão
  >
  >A classe `CategoryResources` é uma implementação de um Rest Controller para manipulação de dados de categoria de um aplicativo utilizando a biblioteca Spring Framework. Ela possui métodos para obter a lista de todas as categorias e obter uma categoria específica pelo seu id. A classe depende da classe `CategoryService` para realizar as operações de CRUD no banco de dados.
  >
  >Exemplo de uso:
  >Ao acessar o endpoint "/categories" através de um navegador ou de uma requisição HTTP, será retornado um 
  >
  >JSON contendo uma lista com todas as categorias cadastradas no sistema.
  >
  >A classe `CategoryResources` é um controlador REST que  disponibiliza endpoints para operações CRUD (Create, Read, Update e  Delete) de uma entidade de categoria. Aqui estão alguns exemplos de como essa classe pode ser usada:
  >
  >
  >
  >1. Para recuperar todas as categorias:
  >
  >```json
  >bash
  >GET http://localhost:8080/categories
  >
  >Response:
  >[
  >   {
  >       "id": 1,
  >       "name": "Eletrônicos"
  >   },
  >   {
  >       "id": 2,
  >       "name": "Livros"
  >   },
  >   {
  >       "id": 3,
  >       "name": "Roupas"
  >   }
  >]
  >```
  >
  >1. Para recuperar uma categoria específica pelo seu ID:
  >
  >```json
  >bash
  >GET http://localhost:8080/categories/1
  >
  >Response:
  >{
  >   "id": 1,
  >   "name": "Eletrônicos"
  >}
  >```
  >
  >1. Para criar uma nova categoria:
  >
  >```json
  >bash
  >POST http://localhost:8080/categories
  >
  >Request:
  >{
  >   "name": "Brinquedos"
  >}
  >
  >Response:
  >{
  >   "id": 4,
  >   "name": "Brinquedos"
  >}
  >```
  >
  >1. Para atualizar uma categoria existente:
  >
  >```json
  >bash
  >PUT http://localhost:8080/categories/4
  >
  >Request:
  >{
  >   "name": "Jogos"
  >}
  >
  >Response:
  >{
  >   "id": 4,
  >   "name": "Jogos"
  >}
  >```
  >
  >1. Para excluir uma categoria existente:
  >
  >```json
  >bash
  >DELETE http://localhost:8080/categories/4
  >
  >Response: 204 No Content
  >```
  >
  >Esses são apenas alguns exemplos de como a classe `CategoryResources` pode ser usada. Os endpoints e as respostas podem variar de acordo com as necessidades do projeto.



- > ## Classe ResourceExceptionHandler
  >
  > A classe `ResourceExceptionHandler` é um tratador de exceções que intercepta erros lançados durante o processamento de uma requisição e retorna uma resposta HTTP personalizada.
  >
  > ### Atributos
  >
  > A classe não possui atributos.
  >
  > ### Métodos
  >
  > A classe possui apenas um método público:
  >
  > - `entityNotFound(EntityNotFoundException e, HttpServletRequest request)`: esse método é responsável por tratar exceções do tipo `EntityNotFoundException`, que é lançada quando uma entidade não é encontrada no banco de dados. Ele recebe como parâmetro a exceção lançada e o objeto `HttpServletRequest` que contém informações sobre a requisição que causou o erro. Em seguida, cria um objeto `StandardError`, preenchendo-o com informações sobre o erro, como data e hora, status HTTP, mensagem de erro e caminho da requisição. Por fim, retorna um objeto `ResponseEntity` contendo o objeto `StandardError` no corpo da resposta e o status HTTP 404 (not found).
  >
  > ### Anotações
  >
  > A classe utiliza a anotação `@ControllerAdvice`, que indica que ela é um tratador de exceções para todas as classes controladoras do aplicativo.
  >
  > O método `entityNotFound` utiliza a anotação `@ExceptionHandler(EntityNotFoundException.class)`, que indica que ele é um tratador de exceções específico para o tipo `EntityNotFoundException`.
  >
  > ### Retorno
  >
  > O método `entityNotFound` retorna um objeto `ResponseEntity` com o status HTTP 404 (not found) e o corpo da resposta contendo um objeto `StandardError` com informações sobre o erro.
  >
  > ### Dependências
  >
  > A classe depende da classe `EntityNotFoundException` da package `com.devsuperior.backend.services.exceptions` para tratar exceções do tipo `EntityNotFoundException`.

  

  
  
- > ## Classe StandardError
  >
  > A classe `StandardError` é uma classe auxiliar para lidar com exceções nas rotas REST do aplicativo. Ela é utilizada como corpo de resposta quando ocorrem erros nas requisições.
  >
  > ### Atributos
  >
  > A classe possui os seguintes atributos:
  >
  > - `timestamp`: é um objeto da classe `Instant` que representa o momento em que o erro ocorreu.
  > - `status`: é um número inteiro que representa o status HTTP da resposta. Por exemplo, 404 indica que o recurso não foi encontrado e 500 indica um erro interno no servidor.
  > - `error`: é uma string que representa o tipo de erro que ocorreu. Por exemplo, "Not Found" indica que o recurso não foi encontrado.
  > - `message`: é uma string que representa uma mensagem mais detalhada sobre o erro que ocorreu.
  > - `path`: é uma string que representa o caminho da rota que causou o erro.
  >
  > ### Métodos
  >
  > A classe possui os seguintes métodos:
  >
  > - `getTimestamp()`: retorna o objeto `Instant` que representa o momento em que o erro ocorreu.
  > - `setTimestamp(Instant timestamp)`: define o objeto `Instant` que representa o momento em que o erro ocorreu.
  > - `getStatus()`: retorna o número inteiro que representa o status HTTP da resposta.
  > - `setStatus(Integer status)`: define o número inteiro que representa o status HTTP da resposta.
  > - `getError()`: retorna a string que representa o tipo de erro que ocorreu.
  > - `setError(String error)`: define a string que representa o tipo de erro que ocorreu.
  > - `getMessage()`: retorna a string que representa uma mensagem mais detalhada sobre o erro que ocorreu.
  > - `setMessage(String message)`: define a string que representa uma mensagem mais detalhada sobre o erro que ocorreu.
  > - `getPath()`: retorna a string que representa o caminho da rota que causou o erro.
  > - `setPath(String path)`: define a string que representa o caminho da rota que causou o erro.
  >
  > ### Construtor
  >
  > A classe possui um construtor padrão vazio, que não recebe nenhum argumento.
  >
  > ### Utilização
  >
  > A classe é utilizada para encapsular informações sobre erros que ocorrem nas rotas REST do aplicativo. Quando um erro ocorre, um objeto `StandardError` é criado com as informações relevantes sobre o erro e é enviado como resposta ao cliente.
  >
  > ### Exemplo de Uso
  >
  > Suponha que um cliente faça uma requisição para a rota `/products` com um ID de categoria inválido. O servidor pode responder com um objeto `StandardError` que contém informações sobre o erro, como o seguinte:
  >
  > ```java
  > json
  > {
  >   "timestamp": "2023-05-03T18:29:36.210Z",
  >   "status": 404,
  >   "error": "Not Found",
  >   "message": "Category not found",
  >   "path": "/products?categoryId=9999"
  > }
  > ```



## Camada de serviço

* > > ## Classe `CategoryService`
  >>
  > > A classe `CategoryService` é responsável por implementar a lógica de negócio para a manipulação de dados de categoria de um aplicativo. Ela utiliza a biblioteca Spring Framework para acesso ao banco de dados.
  >>
  > > ### Atributos
  >>
  > > A classe possui um atributo:
  >>
  > > - `repository`: é uma instância da classe `CategoryRepository` injetada automaticamente pelo Spring Framework através da anotação `@Autowired`. Essa classe é responsável por realizar as operações de CRUD (create, read, update, delete) no banco de dados para a entidade `Category`.
  >>
  > > ### Métodos
  >>
  > > A classe possui três métodos públicos:
  >>
  > > - `findAll()`: esse método retorna uma lista de objetos `CategoryDTO` com todas as categorias cadastradas no banco de dados. Ele utiliza a anotação `@Transactional(readOnly = true)` para indicar que a operação é somente leitura. Esse método chama o método `findAll()` da classe `CategoryRepository` para obter uma lista de objetos `Category`. Em seguida, usa uma expressão lambda para converter cada objeto `Category` em um objeto `CategoryDTO`. Por fim, retorna a lista de objetos `CategoryDTO`.
  > > - `findById(Long id)`: esse método retorna um objeto `CategoryDTO` correspondente ao id fornecido. Ele utiliza a anotação `@Transactional(readOnly = true)` para indicar que a operação é somente leitura. Esse método chama o método `findById(Long id)` da classe `CategoryRepository`, passando o parâmetro `id`. Em seguida, usa a classe `Optional` para verificar se o objeto `Category` foi encontrado no banco de dados. Se não foi encontrado, lança uma exceção `EntityNotFoundException`. Caso contrário, converte o objeto `Category` em um objeto `CategoryDTO` e retorna o objeto `CategoryDTO`.
  >> - `insert(CategoryDTO dto)`: esse método cria uma nova categoria no banco de dados. Ele instancia um novo objeto `Category`, define o nome da categoria e salva no banco de dados usando o método `save()` da classe `CategoryRepository`. Em seguida, converte o objeto `Category` em um objeto `CategoryDTO` e retorna o objeto `CategoryDTO`.
  > >
  >> ### Anotações
  > >
  >> A classe utiliza a anotação `@Service` do Spring Framework para indicar que a classe é um componente do Spring que será injetado automaticamente em outras classes que dependem dela.
  > >
  > > Os métodos da classe utilizam a anotação `@Transactional(readOnly = true)` para indicar que a operação é somente leitura no banco de dados.
  >>
  > > A classe depende da classe `CategoryRepository`, que é injetada automaticamente pelo Spring Framework através da anotação `@Autowired`.
  >>
  > > ### Retorno
  >>
  > > Os métodos `findAll()` e `findById(Long id)` da classe retornam objetos `CategoryDTO`.
  >>
  > > O método `insert(CategoryDTO dto)` retorna o objeto `CategoryDTO` correspondente à categoria criada.
  >>
  > > ## Conclusão
  >>
  > > A classe `CategoryService` é responsável por implementar a lógica de negócio para a manipulação de dados de categoria de um aplicativo utilizando a biblioteca Spring Framework. Ela possui métodos para obter a lista de todas as categorias, obter uma categoria específica pelo seu id e criar uma nova categoria. A classe depende da classe `CategoryRepository` para realizar as operações de CRUD no banco de dados. Os métodos `findAll()` e `findById(Long id)` da classe retornam objetos `CategoryDTO`, enquanto o método `insert(CategoryDTO dto)` retorna o objeto
  >
  > Exemplo de uso: Ao utilizar a classe CategoryService, é possível obter uma lista com todas as categorias cadastradas no sistema através do método findAll(). Para isso, basta injetar a instância de CategoryService em outras classes e chamar o método desejado. Por exemplo:
  >
  > ```java
  >@Service
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



* > ## Classe EntityNotFoundException
  >
  > A classe `EntityNotFoundException` é uma exceção personalizada que pode ser lançada por um serviço devido à não existência de uma entidade solicitada.
  >
  > ### Construtor
  >
  > A classe possui um único construtor que recebe uma mensagem de erro como parâmetro:
  >
  > - `EntityNotFoundException(String msg)`: cria uma nova exceção com a mensagem de erro especificada.
  >
  > ### Herança
  >
  > A classe herda da classe `RuntimeException`, que é uma classe de exceção não verificada. Isso significa que o compilador não obriga a lidar com essa exceção (através de uma cláusula try-catch, por exemplo), tornando a classe uma opção conveniente para lançar exceções em serviços.
  >
  > ## Conclusão
  >
  > A classe `EntityNotFoundException` é uma exceção personalizada que pode ser lançada por um serviço quando uma entidade solicitada não existe. Isso permite que o serviço notifique o cliente (ou a camada de controle) de que algo deu errado de forma clara e precisa.

  

## Camada de acesso a dados (Repository)

* CategoryRepository

  > A classe `CategoryRepository` é uma interface que estende a interface `JpaRepository` do Spring Data JPA, que oferece um conjunto de métodos padrão para realizar operações básicas de acesso a dados, como criar, ler, atualizar e excluir (CRUD) entidades no banco de dados.
  >
  > A anotação `@Repository` indica que a classe é um componente do Spring e será gerenciada pelo container do Spring, permitindo que ela seja injetada automaticamente em outras classes.
  >
  > Além disso, a interface `CategoryRepository` define um método `findAll()` que retorna uma lista com todas as categorias cadastradas no banco de dados.
  >
  > A interface `JpaRepository` espera dois tipos genéricos, sendo o primeiro o tipo da entidade gerenciada pelo repositório (neste caso, a classe `Category`) e o segundo o tipo do identificador da entidade (neste caso, `Long`). Essa informação é usada pelo Spring Data JPA para gerar automaticamente consultas SQL apropriadas para o banco de dados.

  

