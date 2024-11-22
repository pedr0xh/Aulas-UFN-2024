# Sistema de Gerenciamento de Empréstimos de Itens

## Descrição do Projeto

Este projeto visa o desenvolvimento de uma aplicação Java para gerenciar o empréstimo de itens como chaves, controles, canetas, entre outros. O sistema permite registrar empréstimos e devoluções, controlar o estado dos itens e gerar relatórios sobre o uso, com uma interface gráfica em **Java Swing** e comunicação cliente-servidor utilizando **sockets**.

## Funcionalidades

- **Cadastro de Itens**: Permite inserir informações como nome, categoria e estado do item (disponível ou emprestado).
- **Cadastro de Usuários**: Registra dados dos usuários, como nome, matrícula e contato.
- **Registro de Empréstimos e Devoluções**: Controla o status do item com data e hora de empréstimo e devolução.
- **Consulta de Histórico**: Exibe o histórico de empréstimos e devoluções por item e por usuário.
- **Relatórios**:
  - Itens mais emprestados.
  - Itens com devoluções atrasadas.

## Requisitos Técnicos

- **Banco de Dados**: MySQL para armazenamento de dados.
- **Interface Gráfica**: Java Swing para interação com o usuário.
- **Comunicação Cliente-Servidor**: Utilização de sockets para permitir acesso em rede local.
- **Multithreading no Servidor**: Implementação de threads para permitir conexões simultâneas de múltiplos clientes.

## Estrutura do Projeto

