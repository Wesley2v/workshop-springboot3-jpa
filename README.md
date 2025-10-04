# Workshop Spring Boot 3 com JPA

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Wesley2v/workshop-springboot3-jpa/blob/main/LICENSE)

## Sobre o projeto

O Workshop Spring Boot 3 com JPA é um projeto de estudo que apresenta conceitos essenciais do Spring Boot 3 e JPA para criar um sistema de gerenciamento de pedidos e produtos. 
O projeto está organizado no padrão de camadas e aborda aspectos como entidades, repositórios, controladores, serviços, perfis de execução, manipulação de datas, relacionamentos de entidades e tratamento de exceções.

## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias: 

- Java (21)
- Spring Boot
- JPA / Hibernate
- H2 / PostgreSQL
- Maven

## Modelo de domínio

![image](https://raw.githubusercontent.com/Wesley2v/assets/refs/heads/main/workshop-model.png)

## Funcionalidades Implementadas

O projeto inclui as seguintes funcionalidades:

- Gerenciamento de pedidos e produtos através de entidades e repositórios JPA.
- Utilização de diferentes perfis de execução para ambientes de testes, desenvolvimento e produção.
- Manipulação de datas e timestamps para rastreamento de criação e atualização.
- Implementação de relacionamentos entre entidades, como pedidos e produtos.
- Tratamento de exceções personalizado através de Exception Handling.

## Passos para Executar Localmente

1. **Clone o repositório:**

    ```
    git clone https://github.com/Wesley2v/workshop-springboot3-jpa.git
    ```

2. **Acesse o diretório do projeto:**

    ```
    cd workshop-springboot3-jpa
    ```

3. **Compile o projeto:**

    ```
    mvn clean install
    ```

4. **Execute a aplicação:**

    ```
    mvn spring-boot:run
    ```

5. **Acesse a API:**

    Acesse a API no navegador ou em ferramentas como o Postman através do endereço [http://localhost:8080](http://localhost:8080).


## Observações

- Este projeto foi criado como um ambiente de aprendizado para explorar os conceitos do Spring Boot 3 e JPA.
- Certifique-se de ter o Java(21) e o Maven instalados para executar o projeto.

