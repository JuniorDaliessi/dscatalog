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

  - Acesso a dados (Repository)

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
### Classes

- CategoryResource
  
-- """ +-----------------------------------+
|          CategoryResources        |
+-----------------------------------+
|                                   |
|                                   |
+-----------------------------------+
| + findAll(): ResponseEntity<List< |
|              Category>>           |
+-----------------------------------+
"""




