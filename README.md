# Todolist

Gerenciador de tarefas desenvolvido em Java com Spring Boot.

## Tecnologias Utilizadas

- **Java 21**  
  Linguagem principal do projeto.

- **Spring Boot 3.4.5**  
  Framework para facilitar a criação de aplicações Java, fornecendo configuração automática, injeção de dependências e suporte a web.

- **Spring Data JPA**  
  Abstração para persistência de dados, facilitando a integração com bancos de dados relacionais usando repositórios e entidades.

- **H2 Database**  
  Banco de dados em memória utilizado para desenvolvimento e testes, dispensando configuração externa.

- **BCrypt (at.favre.lib:bcrypt)**  
  Biblioteca para hash seguro de senhas dos usuários.

- **JUnit 5 (Spring Boot Starter Test)**  
  Framework de testes utilizado para garantir a qualidade do código.

## Funcionalidades Implementadas

- **Cadastro de Usuário**
  - Endpoint `/users/` para criação de novos usuários.
  - Verificação de existência de usuário pelo nome de usuário.
  - Senha armazenada de forma segura utilizando hash BCrypt.
  - Persistência dos dados em banco H2 via Spring Data JPA.

- **Estrutura do Projeto**
  - Separação em camadas: controller, model e repository.
  - Utilização de anotações do Spring para injeção de dependências e mapeamento de entidades.

## Como Executar

1. Certifique-se de ter o Java 21 instalado.
2. Execute o projeto
3. Acesse o endpoint para cadastro de usuários via POST em `/users/` passando um body json

```` bash
{
  "name" : "Rodrigo",
  "username": "RodrigoPerfeito",
  "password": "777"
}
```` 
4. Acesse o endpoint para cadastro de tarefas via POST em `/tasks/' 
```` bash
{
  "description": "Tarefa para gravar aula de tasks do curso de spring boot",
  "title": "Gravação de aula",
  "priority": "Alta",
  "startAt": "2025-05-21T17:00:00",
  "endAt": "2025-05-22T17:00:00",
  "idUser":"2d3a18f4-45ba-4928-9d9b-840710d23315"	
}
```` 

## Configurações

- As configurações do banco de dados e aplicação estão em [`src/main/resources/application.properties`](src/main/resources/application.properties).
- O console do H2 pode ser acessado em `/h2-console` durante a execução.

## Testes

- Os testes automatizados estão localizados em [`src/test/java/io/github/englishwithpatricia007/todolist/TodolistApplicationTests.java`](src/test/java/io/github/englishwithpatricia007/todolist/TodolistApplicationTests.java).

---
