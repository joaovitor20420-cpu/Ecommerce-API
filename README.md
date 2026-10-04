# 🛒 E-Commerce API (Enterprise Edition)

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.1-brightgreen?style=for-the-badge&logo=spring)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?style=for-the-badge&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-Ready-2496ED?style=for-the-badge&logo=docker)
![Flyway](https://img.shields.io/badge/Flyway-Migrations-cc0200?style=for-the-badge&logo=flyway)

Uma API RESTful robusta e escalável para e-commerce, desenvolvida com as melhores práticas de Engenharia de Software e Domain-Driven Design (DDD). Este projeto demonstra conceitos avançados como autenticação JWT, mapeamento complexo com Enums, controle de permissões (RBAC) e migrações seguras de banco de dados.

## 🚀 Tecnologias e Arquitetura

O projeto foi construído utilizando um ecossistema moderno e preparado para alta concorrência (Virtual Threads suportadas pelo Java 21).

- **Java 21**: LTS atual, utilizando records e pattern matching.
- **Spring Boot 4.1.1**: Framework core da aplicação.
- **Spring Data JPA & Hibernate**: ORM para manipulação de dados orientada a objetos.
- **Spring Security & JWT**: Autenticação stateless e controle de autorização.
- **PostgreSQL 15**: Banco de dados relacional.
- **Docker Compose**: Orquestração do ambiente de desenvolvimento.
- **Flyway**: Versionamento e controle absoluto do schema do banco de dados.
- **Lombok**: Redução de boilerplate (Getters, Setters, Builders).

## 🧠 Padrões Arquiteturais Aplicados

- **Arquitetura em Camadas**: `Controller` (Recepção), `Service` (Regras de Negócio) e `Repository` (Acesso a Dados).
- **Domain-Driven Design (DDD)**: Entidades ricas e uso estratégico de `Enums` (ex: Categorias de Produto) para otimização de consultas (Zero JOINs).
- **Global Exception Handling**: Interceptador unificado (`@ControllerAdvice`) para retornar respostas JSON padronizadas (ex: 400 Bad Request, 403 Forbidden).
- **Security-First**: Senhas criptografadas no banco (BCrypt) e acesso restrito por Roles (Admin vs User).

## ⚙️ Como executar o projeto

### Pré-requisitos
- Docker e Docker Compose instalados.
- JDK 21 instalado (variável de ambiente configurada).
- Maven instalado (ou utilizar o wrapper `./mvnw`).

### Passo a Passo

1. Suba o banco de dados via Docker:
```bash
docker-compose up -d
```

2. Compile e rode a aplicação (O Flyway executará as migrações automaticamente):
```bash
./mvnw spring-boot:run
```

3. A aplicação estará disponível na porta `8080` (O banco PostgreSQL roda internamente na porta `5434`).

## 📚 Documentação da API

*(Em breve: Rotas mapeadas do Swagger/OpenAPI)*

---
*Desenvolvido por João Vitor - Focado em Engenharia de Software e Código Limpo.*
