# Banco Digital com Java e Orientação a Objetos

Este projeto tem como objetivo reforçar o conhecimento em **Programação Orientada a Objetos (POO)** em Java através da simulação de um **banco digital** com funcionalidades básicas de contas bancárias.

## 💡 Descrição do Desafio

Neste desafio prático, foi implementado um sistema bancário que oferece aos seus clientes dois tipos de contas: **Conta Corrente** e **Conta Poupança**. Ambas as contas suportam as operações de **depósito**, **saque** e **transferência** entre contas da mesma instituição.

O projeto foi desenvolvido utilizando os quatro pilares da POO:
- **Abstração**
- **Encapsulamento**
- **Herança**
- **Polimorfismo**

## 🔧 Funcionalidades

- Criação de contas correntes e poupança
- Realização de depósitos, saques e transferências
- Impressão de extratos individuais
- Registro e listagem de contas em um banco

## 🧱 Estrutura de Classes

- `Cliente` - representa o titular da conta
- `Conta` (abstrata) - classe base com funcionalidades comuns
- `ContaCorrente` e `ContaPoupanca` - especializações da conta
- `Banco` - gerencia o cadastro de contas
- `IConta` - interface com os métodos principais
- `Main` - classe principal com simulação do sistema

## ▶️ Execução

1. Certifique-se de ter o JDK instalado (Java 8+).
2. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
3. Execute o programa:
   ```bash
   java Main
   ```

## 📂 Estrutura do Projeto

```
├── Banco.java
├── Cliente.java
├── Conta.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── IConta.java
└── Main.java
```

## 🚀 Melhorias Futuras (sugestões)

- Adicionar autenticação por senha
- Implementar sistema de juros para poupança
- Criar interface gráfica ou interface web
- Persistência em banco de dados ou arquivos

---

Desenvolvido para fins educacionais com foco em boas práticas de programação orientada a objetos.
