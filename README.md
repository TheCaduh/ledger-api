# 🏦 Ledger API - Controle de Lançamentos Bancários

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot. O objetivo principal é construir um "motor" bancário focado em boas práticas, Clean Code e estabilidade de contratos (DTOs), evoluindo de conceitos básicos até implementações avançadas.

## 🚀 Status do Projeto: Em Desenvolvimento

**Fases Concluídas:**
* [x] **Setup do Ecossistema:** Configuração do Maven, Spring Boot Web e ambiente de desenvolvimento.
* [x] **Camada de Apresentação (Controller):** Criação do endpoint de entrada `POST /lancamentos`.
* [x] **Estabilidade de Contrato (DTO):** Implementação do padrão `Record` do Java para blindar a API contra mudanças internas (`LancamentoRequest`).
* [x] **Protocolo HTTP:** Retorno adequado de Status Code (`201 Created`) e corpo da resposta (JSON).

## 🛠️ Tecnologias Utilizadas até agora
* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3
* **Gerenciamento de Dependências:** Maven
* **Testes de API:** Postman / Insomnia

## 🎯 Próximos Passos
* Construção da Camada de Domínio/Service (Isolamento de regras de negócio).
* Injeção de Dependências (IoC).
* Persistência de Dados com Spring Data JPA e banco em memória (H2).
* Tratamento global de exceções (Controller Advice).

---
*Este projeto faz parte da minha jornada de evolução na programação Backend Java. Acompanhe os commits para ver a evolução da arquitetura!*
