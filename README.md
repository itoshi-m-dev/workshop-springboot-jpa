# 🛠️ Workshop Spring Boot JPA

Este projeto é um workshop prático desenvolvido com **Spring Boot** e **JPA (Java Persistence API)**, com o objetivo de demonstrar a construção de uma API RESTful para gerenciamento de usuários, pedidos e produtos. Ele serve como base para estudos de arquitetura em camadas, persistência de dados e boas práticas em aplicações Java modernas.


## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database (ambiente de testes)  
- Maven  
- Postman  
- Git & GitHub  

## 📦 Funcionalidades

- Cadastro e listagem de usuários  
- Registro de pedidos com associação a usuários e produtos  
- Consulta de pedidos por usuário  
- Persistência em banco de dados H2  
- Tratamento de exceções com mensagens personalizadas  
- Relacionamentos entre entidades (OneToMany, ManyToOne)  

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.itoshi.workshop/
│   │       ├── controllers/
│   │       ├── entities/
│   │       ├── repositories/
│   │       ├── services/
│   │       └── config/
│   └── resources/
│       ├── application.properties
│       └── data.sql
```

## 🧪 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/itoshi-m-dev/workshop-springboot-jpa.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd workshop-springboot-jpa
   ```

3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse o H2 Console:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Usuário: `sa`
   - Senha: *(deixe em branco)*

## 📮 Endpoints Principais

| Método | Endpoint             | Descrição                  |
|--------|----------------------|----------------------------|
| GET    | /users               | Lista todos os usuários    |
| POST   | /users               | Cria um novo usuário       |
| GET    | /orders              | Lista todos os pedidos     |
| POST   | /orders              | Cria um novo pedido        |

## 📚 Aprendizados

Este projeto aborda conceitos fundamentais como:

- Inversão de controle e injeção de dependência  
- Mapeamento objeto-relacional com JPA  
- Boas práticas de organização de código  
- Testes de API com Postman  

## 🧑‍💻 Autor

Desenvolvido por [Emanuel Mellina](https://github.com/itoshi-m-dev) — estudante de Engenharia de Software.
