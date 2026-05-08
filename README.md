<p align="center">
  <a href="./docs/README.en.md">
    <img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge">
  </a>
</p>
# Bank System (Java)

# Football Team Manager

Sistema desenvolvido em Java para gerenciamento de times de futebol, permitindo cadastro, consulta e remoção de times e jogadores utilizando persistência em arquivos `.txt`.

## Funcionalidades

- Cadastro de times
- Cadastro de jogadores
- Consulta de times por identificador
- Remoção de times
- Persistência de dados em arquivo
- Validações de regras de negócio
- Programação Orientada a Objetos (POO)

---

## Estrutura do Projeto

```text
src/
├── app
│   └── Main.java
├── bo
│   └── TimeBo.java
├── dao
│   └── TimeDao.java
├── model
│   ├── Time.java
│   ├── Jogador.java
│   ├── Atacante.java
│   └── Goleiro.java
```

---

## Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Programação Orientada a Objetos
- Manipulação de arquivos
- Collections (`Map`, `List`)
- Tratamento de exceções

---

## Conceitos Aplicados

- Encapsulamento
- Herança
- Polimorfismo
- Abstração
- Separação em camadas (`DAO`, `BO`, `MODEL`)
- Persistência em arquivo texto
- Estruturas de repetição e decisão
- Manipulação de coleções

---

## Como Executar

### Pré-requisitos

- JDK 17+ instalado
- IntelliJ IDEA ou outra IDE Java

### Clonar Repositório

```bash
git clone <(https://github.com/lucascarvalho-oliveira/soccer-team-system.git)>
```

### Executar

1. Abra o projeto na IDE
2. Execute a classe:

```text
Main.java
```

---

## Exemplo de Uso

```text
1 - Adicionar time
2 - Consultar por identificador
3 - Remover time
4 - Sair
```

---

## Estrutura de Persistência

Os dados são armazenados no arquivo:

```text
Time.txt
```

Formato utilizado:

```text
id;nomeTime;tipoJogador;nome;data;numero|
```

---

## Melhorias Futuras

- Interface gráfica
- Banco de dados
- Sistema de atualização de times
- Validação avançada de dados
- API REST com Spring Boot
- Persistência com MySQL/PostgreSQL

---

## Autor

Lucas Carvalho

GitHub:
https://github.com/lucascarvalho-oliveira
