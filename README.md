# TimeOn – Sistema de Agendamento

Projeto  está desenvolvimento usando Java com Spring Boot, com foco em API REST e boas práticas de arquitetura em camadas.  
O sistema permite gerenciar agendamentos de forma simples e eficiente, servindo como base para aprendizado e evolução em desenvolvimento backend.

## Tecnologias
- Java 17  
- Spring Boot 3  
- Maven  
- Spring Data JPA  
- Banco de dados H2 (em memória)  
- Lombok  

## Funcionalidades
- ✔ Cadastro de agendamentos  
- ✔ Listagem de agendamentos  
- ✔ Remoção de agendamentos  
- ✔ API REST pronta para integração com frontend ou evolução futura (login, usuários, etc.)

## Estrutura do projeto
- **controller** → define as rotas da API e faz a ponte com o serviço  
- **service** → contém a lógica de negócio  
- **repository** → interface de persistência usando JPA  
- **model** → entidades que representam os dados  

## Como executar
1. Clone o repositório:
```bash
git clone https://github.com/V1ctorGbr/TimeOn.git
