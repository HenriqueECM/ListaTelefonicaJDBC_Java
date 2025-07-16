# 📞 Lista Telefônica - CRUD com JDBC

## 💡 Objetivo da Atividade

Desenvolver uma aplicação Java de console utilizando **JDBC** para realizar operações **CRUD** (Criar, Ler, Atualizar, Deletar) em uma **lista telefônica** armazenada em um banco de dados MySQL.

O projeto tem como foco o aprendizado dos seguintes conceitos:

- Conexão Java com banco de dados usando JDBC
- Utilização de `PreparedStatement` e `ResultSet`
- Execução de comandos SQL dentro da aplicação
- Princípios básicos de organização em camadas (modelo, DAO, main)

---

## 🧱 Estrutura do Projeto

O sistema é baseado em uma única entidade chamada `Contato`, com os seguintes atributos:

- `int id`
- `String nome`
- `String telefone`

As classes implementadas são:

- `Contato` – Representa o modelo da entidade.
- `ContatoDAO` – Responsável pelas operações CRUD.
- `Conexao` – Realiza a conexão com o banco de dados.
- `Main` – Contém o menu interativo de navegação no console.

---

## 📋 Funcionalidades

1. 📄 **Listar todos os contatos** (com ordenação alfabética)
2. ➕ **Cadastrar novo contato**
3. ✏️ **Alterar contato por ID**
4. ❌ **Deletar contato por ID**
5. 🔍 **Pesquisar contato por nome** (usando `LIKE`)
6. 🚪 **Sair**

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 11 ou superior)
- JDBC
- Docker DeskTop
- MySQL
- IntelliJ IDEA / Eclipse (opcional)
- Console (via `Scanner`)

---

## 🧪 Banco de Dados

### 📌 Estrutura da Tabela

```sql
CREATE TABLE contato (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    telefone VARCHAR(20)
);
```
---

## ⚙️ Instruções para Execução
### 1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```
### 2. Importe o projeto em sua IDE Java.
### 3. Configure a conexão com seu banco de dados no arquivo Conexao.java.
### 4. Certifique-se de que o MySQL está ativo e que a tabela contato foi criada.
### 5. Execute a classe Main para iniciar o menu interativo.

## 👨‍💻 Autor
Desenvolvido por [Henrique Menel](https://github.com/HenriqueECM)
