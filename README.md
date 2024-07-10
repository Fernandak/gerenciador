# Gerenciador de clientes

Este projeto é uma aplicação de demonstração utilizando a arquitetura MVC (Model-View-Controller) com Spring Boot 3, Java 17 e PostgreSQL. A aplicação permite gerenciar um cadastro de clientes, com funcionalidades de adicionar, listar, editar e deletar clientes.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot 3**: Framework utilizado para simplificar o desenvolvimento de aplicações Java.
- **Spring Data JPA**: Utilizado para interagir com o banco de dados.
- **Thymeleaf**: Template engine para renderizar as views.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar os dados.
- **Maven**: Ferramenta de automação de build utilizada para gerenciar dependências e executar a aplicação.

## Configuração do Banco de Dados

Certifique-se de que o PostgreSQL está instalado e em execução na sua máquina. Crie um banco de dados e configure as credenciais de acesso no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
```

##Inicialização do Projeto

Pré-requisitos
- **Java 17**
- **Maven**
- **PostgreSQL**

##Passos para inicializar o projeto

1. Clone este repositório para a sua máquina local:

```
git clone https://github.com/Fernandak/gerenciador.git
```
   
 
2. Configure o banco de dados

Atualize as credenciais de acesso ao banco de dados no arquivo 

```
src/main/resources/application.properties
```

3. Compile e execute a aplicação
Use o Maven para compilar e executar a aplicação:

```
mvn clean package
java -jar target/cliente-0.0.1-SNAPSHOT.jar
```

Ou use o comando abaixo para iniciar a aplicação diretamente com o Maven:

```
mvn spring-boot:run
```

##Acessando a Aplicação

Uma vez que a aplicação está em execução, você pode acessá-la através do navegador. Por padrão, a aplicação estará disponível na porta 8080.

- **Listar Clientes: http://localhost:8080/clientes**
- **Adicionar Novo Cliente: http://localhost:8080/clientes/novo**
- **Editar Cliente: http://localhost:8080/clientes/{id}/editar (substitua {id} pelo ID do cliente que deseja editar)**
- **Deletar Cliente: http://localhost:8080/clientes/{id}/deletar (substitua {id} pelo ID do cliente que deseja deletar)**


###Contribuições são bem vindas