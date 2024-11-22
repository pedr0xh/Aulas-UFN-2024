# Sistema de Gerenciamento de Empréstimos de Itens

## Descrição do Projeto

O projeto tem como objetivo o desenvolvimento de uma aplicação **Java** para gerenciar o empréstimo de itens, como chaves, controles, canetas, entre outros. O sistema deve permitir o cadastro de itens e usuários, registrar empréstimos e devoluções, controlar o estado dos itens e gerar relatórios sobre o uso.

### Funcionalidades do Sistema

1. **Cadastro de Itens**
   - Cadastro de itens disponíveis para empréstimo, com informações como:
     - Nome do item.
     - Categoria (ex: eletrônicos, escritório, ferramentas).
     - Estado do item (disponível ou emprestado).

2. **Cadastro de Usuários**
   - Cadastro de usuários que podem realizar o empréstimo de itens, com os seguintes dados:
     - Nome do usuário.
     - Matrícula ou ID.
     - Informações de contato (telefone ou e-mail).

3. **Registro de Empréstimos e Devoluções**
   - O sistema deve permitir registrar quando um item é emprestado ou devolvido, incluindo:
     - Data e hora do empréstimo.
     - Data e hora da devolução.
     - Atualização do estado do item (disponível ou emprestado).

4. **Consulta de Histórico**
   - Permitir a consulta do histórico de empréstimos e devoluções, tanto por item quanto por usuário:
     - Exibir os itens emprestados e devolvidos por um usuário.
     - Exibir o histórico de empréstimos e devoluções de um item específico.

5. **Relatórios**
   - Geração de relatórios com as seguintes informações:
     - Itens mais emprestados.
     - Itens com devoluções atrasadas.

---

## Requisitos Técnicos

- **Banco de Dados**: MySQL para armazenar informações dos itens, usuários e empréstimos.
- **Interface Gráfica**: Java Swing para a criação de interfaces para cadastro, consulta e relatórios.
- **Estrutura do Sistema**: Aplicação cliente-servidor (comunicando a interface gráfica com o banco de dados e o servidor).
  
---

## Estrutura do Projeto

O projeto será organizado nas seguintes áreas:

1. **Banco de Dados (MySQL)**:
   - Contém as tabelas necessárias para armazenar dados de itens, usuários e empréstimos.
   - Exemplo de tabelas: `itens`, `usuarios`, `emprestimos`.

2. **Interface Gráfica (Java Swing)**:
   - Tela de cadastro de itens e usuários.
   - Tela de registro de empréstimos e devoluções.
   - Tela de consulta de histórico e geração de relatórios.

3. **Lógica do Sistema (Java)**:
   - Implementação da lógica de negócio, incluindo manipulação de dados, controle de estados dos itens e geração dos relatórios.

4. **Servidor (Java Sockets)**:
   - Implementação de um servidor que gerencia as conexões com os clientes (interface gráfica).
   - Uso de **threads** para permitir múltiplas conexões simultâneas.

---

## Organização do Grupo

O grupo será composto por até 8 alunos. A distribuição das atividades pode ser feita da seguinte maneira:

1. **Responsável pelo Banco de Dados**:
   - Criar e gerenciar as tabelas no MySQL.
   - Garantir a integridade e a conexão com o sistema.

2. **Responsável pela Interface Gráfica**:
   - Desenvolver as telas em Java Swing para cadastro de itens e usuários.
   - Criar as telas para registro de empréstimos e devoluções, e para consulta de históricos e relatórios.

3. **Responsável pela Lógica de Empréstimos e Devoluções**:
   - Implementar a lógica para registrar os empréstimos e devoluções.
   - Atualizar o estado dos itens e registrar a data e hora do processo.

4. **Responsável pelos Relatórios**:
   - Implementar a geração de relatórios de itens mais emprestados e devoluções atrasadas.

5. **Responsável pela Comunicação Cliente-Servidor**:
   - Implementar a comunicação entre o cliente (interface gráfica) e o servidor usando sockets.
   - Garantir a integridade e o desempenho da comunicação entre os componentes.

6. **Responsável pela Integração e Testes**:
   - Garantir que todas as partes do sistema se comuniquem corretamente.
   - Testar o sistema e corrigir problemas antes da apresentação.

---

## Cronograma de Desenvolvimento

1. **Semana 1-2**: 
   - Definição da estrutura do banco de dados.
   - Início do desenvolvimento da interface gráfica.

2. **Semana 3-4**: 
   - Implementação da lógica de empréstimos e devoluções.
   - Desenvolvimento da funcionalidade de consulta de histórico e geração de relatórios.

3. **Semana 5**: 
   - Testes de integração entre a interface gráfica, banco de dados e servidor.
   - Correções e ajustes finais.

4. **Semana 6 (última semana antes da apresentação)**:
   - Testes finais e preparação para a apresentação.

---

## Importante

- **Prazo**: A apresentação ocorrerá até o dia **13/12**.
- **Avaliação**: Cada membro do grupo deverá explicar sua parte do sistema, detalhando o que desenvolveu e os desafios enfrentados.
- **Nota**: Se o sistema não estiver funcional no dia da apresentação, a nota será **0**.

---

## Como Contribuir

1. **Divisão das Tarefas**: Organize-se para que cada membro do grupo se responsabilize por uma parte do sistema.
2. **Código e Versionamento**: Utilizem o GitHub para versionamento do código, criando branches para cada funcionalidade.


