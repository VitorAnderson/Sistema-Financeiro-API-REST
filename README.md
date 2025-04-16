# 💸 Sistema Financeiro - API REST com Spring Boot

Projeto desenvolvido para controle de transações financeiras pessoais, utilizando Java com Spring Boot.  
Permite cadastrar, listar, atualizar e excluir receitas e despesas de forma simples e eficiente.

---

## 🚀 Funcionalidades

- ✅ Cadastro de transações (receitas/despesas)
- ✅ Listagem de todas as transações
- ✅ Atualização de dados por ID
- ✅ Exclusão de transações
- ✅ Validação automática dos campos
- ✅ Retorno de erros amigáveis com mensagens claras

---

## 💻 Tecnologias utilizadas

- Java 21  
- Spring Boot 3  
- Spring Web  
- Spring Data JPA  
- H2 Database (banco em memória)  
- Jakarta Bean Validation  
- Hibernate Validator  
- Maven  

---

## 🎯 Regras de validação

- A descrição **não pode ser vazia**
- O valor **deve ser maior que zero**
- A data **não pode ser no futuro**
- O tipo (RECEITA ou DESPESA) **é obrigatório**

---

## 📦 Endpoints principais

| Método | Rota                | Descrição                   |
|--------|---------------------|-----------------------------|
| GET    | `/transacoes`       | Lista todas as transações   |
| POST   | `/transacoes`       | Cria nova transação         |
| PUT    | `/transacoes/{id}`  | Atualiza uma transação      |
| DELETE | `/transacoes/{id}`  | Deleta uma transação        |

---

## 🧪 Exemplo de requisição (POST)

```json
{
  "descricao": "Salário",
  "valor": 3500.00,
  "tipo": "RECEITA",
  "data": "2025-04-11"
}

---

##❌ Exemplo de retorno de erro (validação)

{
  "valor": "O valor deve ser maior que zero"
}


---


## 📂 Como rodar o projeto

1. Clone o repositório
git clone https://github.com/VitorAnderson/Sistema-Financeiro-API-REST.git

2. Acesse o diretório
cd sistema-financeiro

3. Abra na sua IDE (IntelliJ, Eclipse, VS Code)

4. Rode a classe principal: SistemaFinanceiroApplication.java
