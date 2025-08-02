# TP3 - Registrar Pedido em Java

## Sobre o Projeto

Este projeto é a terceira etapa do Trabalho de Projeto de Bloco (TP3) do curso, focado na modelagem de classes e na implementação inicial de um sistema simples para registrar pedidos, baseado no método RUP (Rational Unified Process).

O objetivo principal é praticar a modelagem orientada a objetos a partir dos casos de uso já definidos, elaborando um dicionário de dados, diagrama UML e iniciar a implementação prática do sistema em Java. A implementação consiste em uma aplicação de linha de comando que faz leitura e escrita de arquivos CSV para armazenar os pedidos.

---

## Funcionalidades Implementadas

- Modelagem das classes principais: Cliente, Produto, Pedido e serviço para manipulação de arquivos CSV.
- Leitura e escrita de pedidos no arquivo `data/pedidos.csv`.
- Persistência simples dos dados, onde cada pedido armazena informações do cliente, produtos, quantidade e valor total.
- Criação da pasta `data` automaticamente, caso não exista.
- Listagem dos pedidos salvos no console.

---

## Estrutura do Projeto

- `src/model/` — Classes do domínio (Cliente, Produto, Pedido).
- `src/service/` — Serviço para salvar e listar pedidos em CSV (`PedidoCSVService`).
- `src/Main.java` — Classe principal que simula o cadastro de pedidos.
- `data/pedidos.csv` — Arquivo CSV que armazena os pedidos registrados.

---

## Como Rodar

1. Compile os arquivos Java:

```bash
javac -d out src/model/*.java src/service/*.java src/Main.java
```
2. Execute o programa:

3.
```bash
java -cp out Main
```

---

## Observações
- Para simplicidade e foco no aprendizado, os dados são armazenados em um único arquivo CSV.

- O projeto pode ser expandido futuramente para separar clientes, produtos e pedidos em arquivos distintos.

- A pasta data é criada automaticamente para garantir a persistência dos arquivos.

---
## Autor
Lucas Amorim Porciuncula


